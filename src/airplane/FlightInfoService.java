package airplane;

import java.util.HashMap;

public class FlightInfoService {
	public static HashMap<String, String> airLineid = new HashMap<>();

	public static HashMap<String, String> airPortid = new HashMap<>();

	public static void setAirLineid() {
		airLineid.put("�ƽþƳ��װ�", "AAR");
		airLineid.put("����λ�", "ABL");
		airLineid.put("�̽�Ÿ�װ�", "ESR");
		airLineid.put("�����װ�", "JJA");
		airLineid.put("�� ����", "JNA");
		airLineid.put("���� �װ�", "KAL");
		airLineid.put("Ƽ�����װ�", "TWB");
		

	}

	public static void setAirPortid() {
		airPortid.put("����", "NAARKJB");
		airPortid.put("����", "NAARKJJ");
		airPortid.put("����", "NAARKJK");
		airPortid.put("����", "NAARKJY");
		airPortid.put("����", "NAARKNW");
		airPortid.put("���", "NAARKNY");
		airPortid.put("����", "NAARKPC");
		airPortid.put("����", "NAARKPK");
		airPortid.put("��õ", "NAARKPS");
		airPortid.put("���", "NAARKPU");
		airPortid.put("��õ", "NAARKSI");
		airPortid.put("����", "NAARKSS");
		airPortid.put("����", "NAARKTH");
		airPortid.put("�뱸", "NAARKTN");
		airPortid.put("û��", "NAARKTU");
	}
}
