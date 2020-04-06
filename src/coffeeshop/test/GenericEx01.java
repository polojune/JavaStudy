package coffeeshop.test;

class Data<T> {
	T value;
}

class Str<K,V>{
	K k;
	V v;
}

public class GenericEx01 {

	public static void main(String[] args) {

		Data<String> data = new Data<>();
		data.value = "문자열";
		System.out.println(data.value);

		// Wrapper 클래스 (8기본자료형을 클래스화 시켜준다)
		Data<Integer> data2 = new Data<>();
		data2.value = 10;
		System.out.println(data2.value);
		
		Str<String,String>s =new Str<>();
		s.k = "비밀번호";
		s.v = "bitc 5600";
		
		System.out.println(s.k);
		System.out.println(s.v);
		
	}

}
