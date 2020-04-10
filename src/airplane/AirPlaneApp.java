package airplane;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class AirPlaneApp {

	public static int getTotalCount(String depAirportId, String arrAirportId, long depPalndTime) {
		try {
			// 1�� �ּ� ��ü �����
			// URL url = new URL("https://www.naver.com");
			URL url = new URL(
					"http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=b9Wuh6%2BeWkKlAtrxWGpQtTdO%2FYkEckdAnj1qdV%2Fs7B1Jr%2BtgRh6rRuUCTSadAGRgByH%2FdRUdi4ne0uDaIJbQMw%3D%3D&numOfRows=50&pageNo="
							+ "&depAirportId=" + FlightInfoService.airPortid.get(depAirportId) + "&arrAirportId="
							+ FlightInfoService.airPortid.get(arrAirportId) + "&depPlandTime=20200407&_type=json");

			// 2�� ��Ʈ�� ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3�� ���� ����(���ڿ�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// tip : ���Ͽ� ��Ʈ�� ����
			// FileWriter fr = new FileWriter("C:\\utils\\test.html");

			// 4.���� ���ϱ��Ҷ��� ��Ʈ�� ������ ����.
			StringBuilder sb = new StringBuilder();

			String input = "";

			while ((input = br.readLine()) != null) {
				sb.append(input);
			}

			br.close(); // ���� �ݱ�
			con.disconnect(); // ��Ʈ�� �ݱ�

			Gson gson = new Gson();
			FlightInfo a = gson.fromJson(sb.toString(), FlightInfo.class);
			return a.getResponse().getBody().getTotalCount();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	public static FlightInfo getFlightInfo(String depAirportId, String arrAirportId, long depPlandTime, int page) {
		try {
			// 1�� �ּ� ��ü �����
			// URL url = new URL("https://www.naver.com");
			URL url = new URL(
					"http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=b9Wuh6%2BeWkKlAtrxWGpQtTdO%2FYkEckdAnj1qdV%2Fs7B1Jr%2BtgRh6rRuUCTSadAGRgByH%2FdRUdi4ne0uDaIJbQMw%3D%3D&numOfRows=50&pageNo="
							+ page + "&depAirportId=" + FlightInfoService.airPortid.get(depAirportId) + "&arrAirportId="
							+ FlightInfoService.airPortid.get(arrAirportId) + "&depPlandTime=20200407&_type=json");

			// 2�� ��Ʈ�� ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3�� ���� ����(���ڿ�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// tip : ���Ͽ� ��Ʈ�� ����
			// FileWriter fr = new FileWriter("C:\\utils\\test.html");

			// 4.���� ���ϱ��Ҷ��� ��Ʈ�� ������ ����.
			StringBuilder sb = new StringBuilder();

			String input = "";

			while ((input = br.readLine()) != null) {
				sb.append(input);
			}

			br.close(); // ���� �ݱ�
			con.disconnect(); // ��Ʈ�� �ݱ�

			Gson gson = new Gson();
			FlightInfo a = gson.fromJson(sb.toString(), FlightInfo.class);
			return a;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public static void main(String[] args) {
		FlightInfoService.setAirLineid();
		FlightInfoService.setAirPortid();

		for (String key : FlightInfoService.airPortid.keySet()) {
			System.out.print(key + "");

		}
		System.out.println();
		System.out.println("������� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String depAirportid = sc.next();

		System.out.println("�������� �Է��ϼ���.");
		String arrAirportid = sc.next();

		System.out.println("������ڸ� �Է��ϼ���.");
		String depPlandTimeTemp = sc.next();

		Long depPlandTime = Long.parseLong(depPlandTimeTemp);
		Integer depPlandTimeInterger = Integer.parseInt(depPlandTimeTemp);
		Double depPlandTimeDouble = Double.parseDouble(depPlandTimeTemp);

		int page = 1;
		String strTemp = depPlandTime + "";
		String strTemp2 = depPlandTimeInterger.toString();
		String strTemp3 = depPlandTimeDouble.toString();

		int totalCount = getTotalCount(depAirportid, arrAirportid, depPlandTime);

		int count = 0;
		if (totalCount % 50 == 0) {
			count = totalCount / 50;
		} else {
			count = totalCount / 50 + 1;
		}

		ArrayList<FlightInfo> flightInfos = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			FlightInfo flightInfo = getFlightInfo(depAirportid, arrAirportid, depPlandTime, page);
			page++;
			flightInfos.add(flightInfo);
		}

		for (FlightInfo flightInfo : flightInfos) {// 122�� -3��
			List<Item> temp = flightInfo.getResponse().getBody().getItems().getItem();

			// iterable (�ݺ�)
			for (Item item : flightInfo.getResponse().getBody().getItems().getItem()) {// forEach��
				System.out.println("�װ��� : " + item.getAirlineNm());
				System.out.println("����� : " + item.getDepAirportNm());
				System.out.println("������ : " + item.getArrAirportNm());
				System.out.println("��߽ð� : " + item.getDepPlandTime());
				System.out.println("�����ð� : " + item.getArrPlandTime());
				System.out.println("��� : " + item.getEconomyCharge());
				System.out.println();
			}
		}

	}
}