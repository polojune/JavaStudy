package simple;

public class ForEx01 {
	public static void main(String[] args) {
		
		// i �� 0 ~ 9 ���� ���� for���� �����
		
		// i �� 2�� ��� continue �� �����Ѵ�
		
		// i �� 7�� ��� break�� �����Ѵ�
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 2) {
				
				System.out.println("continue ����");
				continue;
				
			} else if(i == 7) {
				
				System.out.println("break ����");
				break;
				
			}
			System.out.println(i);
		}
	}
}
