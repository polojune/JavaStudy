package corona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class CoronaApp {

	public static CoronaInfo getcoronaInfo(String addr, int page) {
		try {
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=" + page);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			StringBuilder sb = new StringBuilder();

			String input = "";

			while ((input = br.readLine()) != null) {
				sb.append(input);
			}
			br.close();
			con.disconnect();

			Gson gson = new Gson();
			CoronaInfo c = gson.fromJson(sb.toString(), CoronaInfo.class);
			return c;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {
		System.out.println("지역을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String addr = sc.next();
		int page = 1;
		ArrayList<CoronaInfo> coronaInfos = new ArrayList<>();

		for (int i = 0; i < 54; i++) {
			CoronaInfo coronaInfo = getcoronaInfo(addr, page);
			page++;
			coronaInfos.add(coronaInfo);
		}
		for (CoronaInfo coronaInfo : coronaInfos) { // 122개 - 3번
			List<StoreInfos> coronaItems = coronaInfo.getStoreInfos();
			// iterable (반복)
			for (StoreInfos item : coronaItems) { // forEach 문 50번
				if (item.getAddr().contains(addr)) {
					System.out.println("주소 : " + item.getAddr());
					System.out.println();

				}

			}
		}

	}
}
