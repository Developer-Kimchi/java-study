package input;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 출력
//		nextInt() : 입력받은 정수
		
//		3개의 정수를 담을 변수 3개 선언, 결과값 변수 선언
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
//		입력 클래스 선언
		Scanner sc = new Scanner(System.in);
//		출력할 메시지 변수에 담기
		String message = "세 정수를 입력하세요", example = "예) 1 5 7", format = "%d + %d + %d = %d";
//		메시지 출력
		System.out.println(message);
		System.out.println(example);
//		입력받은 3개의 정수를 각 변수에 대입
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
//		각 변수를 더한 결과를 변수에 대입
		result = number1 + number2 + number3;
//		결과값 출력
		System.out.printf(format, number1, number2, number3, result);
		
	}

}
