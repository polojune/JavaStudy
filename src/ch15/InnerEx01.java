package ch15;

//����Ŭ���� - Ŭ���� �ȿ� Ŭ������ �ִ°� 
//���ο��� �� �ڽ��� �����Ҷ� ���

class MyOuterClass {
	int outerNum = 10;

	public MyOuterClass() {
		MyInnerClass mc = new MyInnerClass();
		System.out.println(mc.innerNum);
	}
	
	class MyInnerClass {
		int innerNum = 20;
	}
}

public class InnerEx01 {

	public static void main(String[] args) {
		//�ܺο��� ����Ŭ������ �����Ҷ� 
		//�̷��� ����ҰŸ� Ŭ������ �ܺη� ������ ���� ���
		MyOuterClass moc = new MyOuterClass();
		MyOuterClass.MyInnerClass d = moc.new MyInnerClass();
	}

}
