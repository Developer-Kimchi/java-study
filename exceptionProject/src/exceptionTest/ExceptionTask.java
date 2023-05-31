package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기
		Scanner sc = new Scanner(System.in);
//		5개 정수 담을 배열
		int[] arData = new int[5];
		String temp = null;
		
//		얼만큼 반복할 건지 생략, 무한반복된다.
			for(int i=0; ;i++) {
				System.out.println(i + 1 + "번째 정수[q: 나가기]");
				temp = sc.next();
//				q 입력할 경우 종료
				if(temp.toLowerCase().equals("q")) {break;}
				try {
					arData[i] = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("정수만 입력해주세요");
//					다시 돌아갔을 때 i값 증가하지 못하도록 
					i--;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("5개의 정수만 입력이 가능합니다.");
//					범위에 맞게 조정하여 출력
					for(int j = 0; j < arData.length; j++) {
						System.out.print(arData[j] + " ");
					}
					
					break;
//					위 상황 외의 예외 처리
				} catch(Exception e) {
					System.out.println("다시 시도해주세요");
				}
				
			}
	}
}
