package simple;


class ����{
	String �̸� = "ȫ�浿";
	String ��ȭ��ȣ = "010-1234-5678";
}


public class IntVsClass {
	
	static int �⺻�ڷ�����ȯ() {
		
		return 123;
		
	}
	
	static ���� Ŭ�����ڷ�����ȯ() {
		
		���� m1 = new ����();
		
		return m1;
	}
	
	public static void main(String[] args) {
		System.out.println("�⺻�ڷ�����ȯ : " + �⺻�ڷ�����ȯ());
		
		System.out.println();
		
		���� m2 = Ŭ�����ڷ�����ȯ();
		
		System.out.println("Ŭ�����ڷ�����ȯ : " + m2);
	}
}
