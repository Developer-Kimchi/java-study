package apiTest;

public class Api_test {
	public static void main(String[] args) {
//		������ Calc Ŭ������ ������ �ʾƵ� ��� Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�
		Calc calc = new Calc();
		try {
			System.out.println(calc.divide(10, 3));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
}