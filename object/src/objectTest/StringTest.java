package objectTest;

public class StringTest {

	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");
	
//		"ABC"(���ڹ迭, ���)�� �ּҸ� �� -> true
		System.out.println(data1 == data2);
//		�ٸ� �ּ��̹Ƿ� false
		System.out.println(data3 == data4);
		
//		�ʵ尪�� �� -> �� �� true
		System.out.println(data1.equals(data2));
		System.out.println(data3.equals(data4));
	}

}
