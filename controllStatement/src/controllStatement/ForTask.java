package controllStatement;

import java.util.Scanner;

public class ForTask {

	public static void main(String[] args) {		
//		      브론즈
//		      1~100까지 출력
		      for (int i = 0; i < 100; i++) {
		         System.out.println(i + 1);
		      }
		      
//		      100~1까지 출력
		      for (int i = 0; i < 100; i++) {
		         System.out.println(100 - i);
		      }
		      
//		      1~100까지 중 짝수만 출력
		      for (int i = 0; i < 50; i++) {
		         System.out.println((i + 1) * 2);
//		         1 * 2, 2 * 2, 3 * 2 .....
		      }
		      
//		      실버
//		      1~10까지 합 출력
		      int total = 0;
		      for (int i = 0; i < 10; i++) {
		         total += i + 1;
//		         total = 0 + 1;
//		         total = (0 + 1) + 2;
//		         total = (0 + 1 + 2) + 3;
		      }
		      System.out.println(total);
		      
//		      1~n까지 합 출력(n은 입력받는다)
		      Scanner sc = new Scanner(System.in);
		      int total1 = 0, end = 0;
//		      총합 담을 변수와 입력받을 변수 선언
		      
		      System.out.print("1~n까지의 합 출력\nn: ");
		      end = sc.nextInt();
		      
		      for (int i = 0; i < end; i++) {
		         total1 += i + 1;
		      } 
		      System.out.println(total1);
		      
//		      골드
//		      A~F까지 출력
		      for (int i = 0; i < 6; i++) {
		         System.out.println((char)(i + 65));
		      }
		      
//		      A~F까지 중 C제외하고 출력(continue 사용하지 않기)
		      for (int i = 0; i < 5; i++) {
		         System.out.println((char)(i > 1 ? i + 66 : i + 65));
//		         C는 65 + 2. i가 1보다 크다면(즉 65 + 2라면) 68부터 출력하고 아니면 65부터 출력해라 
		      }
		      
//		      다이아
//		      0 1 2 3 0 1 2 3 0 1 2 3 출력
		      for (int i = 0; i < 12; i++) {
		         System.out.print(i % 4 + " ");
//		         %n 하면 어떤 수든 0 ~ n-1의 범위를 갖는다.
		      }
		      
//		      aBcDe...Z 출력
//		      A : 65
//		      a : 97
		      for (int i = 0; i < 26; i++) {
		         System.out.print((char)(i % 2 == 0 ? i + 97 : i + 65));
//		         i가 짝수일 때(2의 배수일 때) 소문자, 홀수는 대문자
		      }

		}
	}
