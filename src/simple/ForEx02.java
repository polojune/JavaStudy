package simple;

public class ForEx02 {
	public static void main(String[] args) {

		// ������ 10���� int �迭�� �����
		// for���� �̿��Ͽ� 0 ~ 9 �� �����Ѵ�

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {

			System.out.print((arr[i] = i)+ " ");

		}

		// for each ��
		int arr1[] = new int[10];

		int temp = 0;
		for (int i : arr1) {

			System.out.print((i = temp)+" ");

			temp++;

		}
	}
}
