package airplane1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class AirPlaneApp1 {

	public static FlightInfo getFlightInfo(String depAirportNm, String arrAirportNm, long depPlandTimeTemp) {
		try {
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/"
					+ "DmstcFlightNvgInfoService/getFlightOpratInfoList"
					+ "?serviceKey=HDnees3XRFcYI5imOWyGDoft864vNfw3W7XnNJu1yL4uhgzQkQjdCOlJt5c6pNddOf38Hu2L53NUAmFVk0Tz1A%3D%3D&numOfRows=100&pageNo=1&depAirportId=NAARKSS&arrAirportId=NAARKPC&depPlandTime=20200411&_type=json");

			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			StringBuilder sb = new StringBuilder();

			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}

			br.close(); // 버퍼 닫기
			con.disconnect();// 스트림 닫기

			Gson gson = new Gson();
			FlightInfo a = gson.fromJson(sb.toString(), FlightInfo.class);

			return a;
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println("출발지를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String depAirportNm = sc.next();

		System.out.println("도착지를 입력하세요.");
		String arrAirportNm = sc.next();

		System.out.println("출발일자를 입력하세요.");
		long depPlandTimeTemp = sc.nextLong();

		FlightInfo flightInfo = getFlightInfo(depAirportNm, arrAirportNm, depPlandTimeTemp);

		List<Item> temp = flightInfo.getResponse().getBody().getItems().getItem();
       
		for(Item item :flightInfo.getResponse().getBody().getItems().getItem()) {
			System.out.println("항공사:"+item.getAirlineNm());
		}
	}
}
