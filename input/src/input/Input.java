package input;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
//		3���� ������ �� ���� �Է¹��� �� ���� ���
//		nextInt() : �Է¹��� ����
		
//		3���� ������ ���� ���� 3�� ����, ����� ���� ����
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
//		�Է� Ŭ���� ����
		Scanner sc = new Scanner(System.in);
//		����� �޽��� ������ ���
		String message = "�� ������ �Է��ϼ���", example = "��) 1 5 7", format = "%d + %d + %d = %d";
//		�޽��� ���
		System.out.println(message);
		System.out.println(example);
//		�Է¹��� 3���� ������ �� ������ ����
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
//		�� ������ ���� ����� ������ ����
		result = number1 + number2 + number3;
//		����� ���
		System.out.printf(format, number1, number2, number3, result);
		
	}

}
