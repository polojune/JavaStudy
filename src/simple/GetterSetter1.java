package simple;

import java.util.Scanner;

class ����{
	private int num;
	private String password;
	
	public ����(int num, String password) {
		this.num = num;
		this.password = password;
	}
	
	
	public void �����ܾ�Ȯ��(String password) {
		if(this.password.equals(password)) {
			System.out.println("�ܾ��� : " + num);
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void �����Ա�(String password, int money) {
		if(this.password.equals(password)) {
			num = num + money;
			System.out.println("�ܾ��� : " + num);
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
}

public class GetterSetter1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String select;
		int money;
		String password;
		
		���� my = new ����(10000, "a1234");
		
		while (true) {
			System.out.print("1.�Ա� 2.�ܾ�Ȯ�� 3.������ >> ");
			if((select = sc.next()).equals("1")) {
				
				System.out.print("��й�ȣ�� �Է����ּ��� >>");
				password = sc.next();
				System.out.print("�󸶸� �Ա� �Ͻðڽ��ϱ�? >>");
				money = Integer.parseInt(sc.next());
				
				my.�����Ա�(password, money);
				
			} else if(select.equals("2")) {
				
				System.out.print("��й�ȣ�� �Է����ּ��� >>");
				password = sc.next();
				
				my.�����ܾ�Ȯ��(password);
			} else {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
		}
		
	}
}
