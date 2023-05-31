package apiTest;

public class Api_test {
	public static void main(String[] args) {
//		별도로 Calc 클래스를 만들지 않아도 헤당 클래스 타입의 객체를 생성할 수 있다
		Calc calc = new Calc();
		try {
			System.out.println(calc.divide(10, 3));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}