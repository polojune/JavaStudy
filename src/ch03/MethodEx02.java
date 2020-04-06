package ch03;

class Data {
	int num = 10;
}

public class MethodEx02 {

	static int ����(int num) {
		num++;
		System.out.println("���� num:" + num);
		return num;
	}

	static void ����(Data d) {
		d.num--;
		System.out.println("���� num:" + d.num);
	}

	public static void main(String[] args) {
		// Value passing
		int myNum = 100;
		myNum = ����(myNum);
		System.out.println("myNum:" + myNum);

		// Reference passing
		Data data = new Data();
		����(data);
		System.out.println("data.num:" + data.num);
	}

}
