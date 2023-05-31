package oper;

import java.util.Scanner;

public class Oper2 {

	public static void main(String[] args) {
////		 두 정수 입력받기
////		 입력 선언
//		Scanner sc = new Scanner(System.in);
////		변수 선언
//		int number1 = 0, number2 = 0;
////		입력받기
//		number1 = sc.nextInt();
//		number2 = sc.nextInt();
		
//		두 정수 대소비교
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0, lastNumber = 0;
		String message = "정수 두 개를 입력하세요", result = null;
		
		System.out.println(message);
		firstNumber = sc.nextInt();
		lastNumber = sc.nextInt();
		
		result = firstNumber > lastNumber ? "큰 값: " + firstNumber 
				: firstNumber == lastNumber ? "두 수는 같습니다" : "큰 값: " + lastNumber;
		
		System.out.println(result);

	}

}
