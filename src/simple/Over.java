package simple;

public class Over {
	
	static String ������() {
		
		return "��?";
		
	}
	

	static String ������(String �Ҹ�) {
		
		if(�Ҹ�.equals("�����")) {
			
			return "�ȵǿ�, �����ؾߵ˴ϴ�";
			
		} else if(�Ҹ�.equals("������")){
			
			return "���� �ٷ� ������";
			
		} else {
			
			return "��?";
			
		}
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(������());
		
		System.out.println();
		
		System.out.println(������("�����"));
		
	}
}
