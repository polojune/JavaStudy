package ch08;

import com.google.gson.Gson;

class Family {
	int �� = 2;
	String �ƹ��� = "ȫ�Ǽ�";
	String ��Ӵ� = "�ἶ";
}

class Person {
	String �̸� = "ȫ�浿";
	int ���� = 25;
	String ���� = "��";
	String �ּ� = "����Ư���� ��õ�� ��";
	String[] Ư�� = { "��", "����" };
	Family �������� = new Family();
	String ȸ�� = "��� ������ �ȴޱ� �츸��";
}

public class JsonEx01 {

	public static void main(String[] args) {
         Gson gson = new Gson();
         //fromJson()�Լ� :json =>java object 
         //toJson()�Լ� : java object=> json(String)
         String personJson = gson.toJson(new Person());
         System.out.println(personJson);
	}

}
