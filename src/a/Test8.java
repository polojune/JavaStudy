package a;

import java.util.Scanner;

//���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�.
//���� ���� 10���� �Է��Ͻÿ� >> 1 5 99 22 345 125 2346 55 32 85
//3�� ����� 99 345 2346 
public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("3�� �����");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}
}
