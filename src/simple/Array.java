package simple;

import java.util.ArrayList;

public class Array {
	
	// �迭�� Ŭ���� �ڷ����� �ƴ����� �ּҴ�
	// �迭�� �ѹ� ���̰� �������� ���̰ų� ���� �� ����
	static int[] intArray = {0,1,2};
	
	
	// ��̸���Ʈ�� �빮�ڷν����ϱ� ������ �����ڷ����̴�
	// 
	static ArrayList<Integer> intArrayList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		// intArray�� ����ϸ� �ּҰ��� ���´�.
		//System.out.println(intArray);
		
		//System.out.println(intArray[0]);
		
		// �迭�� ���� �� �����Ƿ� �ȵ�
		//intArray[3] = 3;
		
		//System.out.println(intArray[3]);
		

		
		
		// ��̸���Ʈ
		//System.out.println(intArrayList);
		
		intArrayList.add(222);
		
		//System.out.println(intArrayList);
		
		intArrayList.add(333);
		
		//System.out.println(intArrayList);
		
		//System.out.println(intArrayList.get(0));
		
		System.out.println(intArrayList.remove(0));
		
		System.out.println(intArrayList.get(1));
		
		intArrayList.clear();
		
		System.out.println(intArrayList);
	}
	
}
