package gsontest;

import com.google.gson.Gson;

public class GsonEx03 {

	public static void main(String[] args) {
		// 1.�ٿ� ���� json������
		String jsonData = "{\"name\":\"�ڽ�\",\"age\":40}";
		System.out.println(jsonData);

		// 2.json ������ =>java ������Ʈ ��ȯ
		Gson gson = new Gson();
		People p  = gson.fromJson(jsonData,People.class);
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}

}
