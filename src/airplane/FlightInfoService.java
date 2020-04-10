package airplane;

import java.util.HashMap;

public class FlightInfoService {
	public static HashMap<String, String> airLineid = new HashMap<>();

	public static HashMap<String, String> airPortid = new HashMap<>();

	public static void setAirLineid() {
		airLineid.put("아시아나항공", "AAR");
		airLineid.put("에어부산", "ABL");
		airLineid.put("이스타항공", "ESR");
		airLineid.put("제주항공", "JJA");
		airLineid.put("진 에어", "JNA");
		airLineid.put("대한 항공", "KAL");
		airLineid.put("티웨이항공", "TWB");
		

	}

	public static void setAirPortid() {
		airPortid.put("무안", "NAARKJB");
		airPortid.put("광주", "NAARKJJ");
		airPortid.put("군산", "NAARKJK");
		airPortid.put("여수", "NAARKJY");
		airPortid.put("원주", "NAARKNW");
		airPortid.put("양양", "NAARKNY");
		airPortid.put("제주", "NAARKPC");
		airPortid.put("김해", "NAARKPK");
		airPortid.put("사천", "NAARKPS");
		airPortid.put("울산", "NAARKPU");
		airPortid.put("인천", "NAARKSI");
		airPortid.put("김포", "NAARKSS");
		airPortid.put("포항", "NAARKTH");
		airPortid.put("대구", "NAARKTN");
		airPortid.put("청주", "NAARKTU");
	}
}
