package dateex;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LottoE1 {

	public static void main(String[] args) {
		// 6���� ��ȣ -(1~45)
		//HashSet ������ ����(��û����)
		//TreeSet ������� ����(HashSet���� ����)
		Set<Integer> lottoSet = new TreeSet<>();
		Random r = new Random();
		while (lottoSet.size()<6) {
	       int value = r.nextInt(45)+1;
	       lottoSet.add(value);
		}

		System.out.print(lottoSet);
	}
}
