package c;

abstract class PairMap {
	protected String keyArray[];// key ���� �����ϴ� �迭
	protected String valueArray[];// value ���� �����ϴ� �迭

	abstract String get(String key);// key ���� ���� value ����. ������ null ����

	abstract void put(String key, String value);// key�� value �� ������ ����. ������ key�� ������, ���� value�� ����

	abstract String delete(String key); // key ���� ���� ������(value�� �Բ�)����. ������ value �� ����

	abstract int length(); // ���� ����� �������� ���� ����
}

class Dictionary extends PairMap {
	private int set;

	public Dictionary(int num) {
		keyArray = new String[num];
		valueArray = new String[num];
		this.set = 0;
	}

	@Override
	String get(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;// ���ϴ� key�� ���ٸ� null ����
	}

	@Override
	void put(String key, String value) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key.equals(keyArray[i])) {
				keyArray[i] = key;
				valueArray[i] = value;
				return;// �ߺ��� key�� �ִٸ� �����ϰ� �Լ� ����
			}
		}
		keyArray[set] = key;
		valueArray[set] = value;
		set++;

	}

	@Override
	String delete(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key.equals(keyArray[i])) {
				String s = valueArray[i];
				keyArray[i] = null;
				valueArray[i] = null;
				return s;// ������ value �� ����
			}
		}
		return null; // ���� �Ȱ��� ���ٸ� null ����
	}

	@Override
	int length() {

		return set;
	}

}

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("ȫ�浿", "�ڹ�");
		dic.put("�Ӳ���", "���̽�");
		dic.put("�Ӳ���", "C++"); // �Ӳ����� ���� C++�� ����
		System.out.println("�Ӳ����� ����" + dic.get("�Ӳ���")); // �Ӳ��� ������ ���
		System.out.println("ȫ�浿�� ����" + dic.get("ȫ�浿")); // ȫ�浿 ������ ���
		dic.delete("ȫ�浿");// ȫ�浿 ������ ����
		System.out.println("ȫ�浿�� ����" + dic.get("ȫ�浿")); // ������ ������ ����
	}

}
