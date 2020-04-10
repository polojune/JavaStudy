package ch15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx01 {

	public static void main(String[] args) {

		try {
			// 1번 주소 객체 만들기
			URL url = new URL(
					"http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=HDnees3XRFcYI5imOWyGDoft864vNfw3W7XnNJu1yL4uhgzQkQjdCOlJt5c6pNddOf38Hu2L53NUAmFVk0Tz1A%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");
			// 2번 스트림 연결
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3번 버퍼 연결(문자열)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			// tip:파일에 스트림 연결
			FileWriter fr = new FileWriter("c:\\utils\\test.html");

			// 4. 문자 더하기
			StringBuilder sb = new StringBuilder();

			String input = "";

			while ((input = br.readLine()) != null) {

				sb.append(input);
			}
			System.out.println(sb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Object getItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
