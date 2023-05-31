package objectTest;

public class StringTest {

	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");
	
//		"ABC"(문자배열, 상수)의 주소를 비교 -> true
		System.out.println(data1 == data2);
//		다른 주소이므로 false
		System.out.println(data3 == data4);
		
//		필드값을 비교 -> 둘 다 true
		System.out.println(data1.equals(data2));
		System.out.println(data3.equals(data4));
	}

}
