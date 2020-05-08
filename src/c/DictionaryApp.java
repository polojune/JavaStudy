package c;

abstract class PairMap {
	protected String keyArray[];// key 들을 저장하는 배열
	protected String valueArray[];// value 들을 저장하는 배열

	abstract String get(String key);// key 값을 가진 value 리턴. 없으면 null 리턴

	abstract void put(String key, String value);// key와 value 를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정

	abstract String delete(String key); // key 값을 가진 아이템(value와 함께)삭제. 삭제된 value 값 리턴

	abstract int length(); // 현재 저장된 아이템의 개수 리턴
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
		return null;// 원하는 key가 없다면 null 리턴
	}

	@Override
	void put(String key, String value) {
		for (int i = 0; i < keyArray.length; i++) {
			if (key.equals(keyArray[i])) {
				keyArray[i] = key;
				valueArray[i] = value;
				return;// 중복된 key가 있다면 저장하고 함수 종료
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
				return s;// 삭제된 value 값 리턴
			}
		}
		return null; // 삭제 된것이 없다면 null 리턴
	}

	@Override
	int length() {

		return set;
	}

}

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("홍길동", "자바");
		dic.put("임꺽정", "파이썬");
		dic.put("임꺽정", "C++"); // 임꺽정의 값을 C++로 수정
		System.out.println("임꺽정의 값은" + dic.get("임꺽정")); // 임꺽정 아이템 출력
		System.out.println("홍길동의 값은" + dic.get("홍길동")); // 홍길동 아이템 출력
		dic.delete("홍길동");// 홍길동 아이템 삭제
		System.out.println("홍길동의 값은" + dic.get("홍길동")); // 삭제된 아이템 접근
	}

}
