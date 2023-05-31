package wrapper;

public class WrapperTest {
	public static void main(String[] args) {
		int data_i = 10;
		
//		auto boxing
//		일반타입 변수를 Integer 클래스타입 객체로 변환
		Integer data_I = data_i;
//		
//		auto unboxing
//		Integer 클래스타입 객체를 다시 일반타입 변수로 변환
		data_i = data_I;
//		
//
//		boxing
//		Integer data_I = new Integer(data_i);
//		Integer data_I = Integer.valueOf(data_i);		
		System.out.println(data_I);
		
//		unboxing
		data_i = data_I.intValue();
	}
}
