package simple;

public class While {
	public static void main(String[] args) {
		
		// i�� 1�� �Ǹ� i�� ������Ű�� while ���� �ٽ� ������
		
		// i�� 5���� ũ�� while ���� �������Ͷ�
		
		// �׿ܿ��� i�� ����Ʈ�ض�

		// while
		int i = 0;
		while (i < 100) {
			

			if (i == 1) {
				i++;
				continue;

			} else if (i > 5) {
				break;

			} else {
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println();
		
		
		for (int j = 0; j < 100; j++) {
			
			if (j == 1) {
				continue;
			
			// i�� 5���� ũ�� while ���� �������Ͷ�
			} else if (j > 5) {
				break;
				
			// �׿ܿ��� i�� ����Ʈ�ض�
			} else {
				System.out.println(j);
			}
		}

	}
}
