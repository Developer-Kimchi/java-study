package oper;

import java.util.Scanner;

public class Oper2 {

	public static void main(String[] args) {
////		 �� ���� �Է¹ޱ�
////		 �Է� ����
//		Scanner sc = new Scanner(System.in);
////		���� ����
//		int number1 = 0, number2 = 0;
////		�Է¹ޱ�
//		number1 = sc.nextInt();
//		number2 = sc.nextInt();
		
//		�� ���� ��Һ�
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0, lastNumber = 0;
		String message = "���� �� ���� �Է��ϼ���", result = null;
		
		System.out.println(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		result = firstNumber > lastNumber ? "ū ��: " + firstNumber 
				: firstNumber == lastNumber ? "�� ���� �����ϴ�" : "ū ��: " + lastNumber;
		
		System.out.println(result);

	}

}
