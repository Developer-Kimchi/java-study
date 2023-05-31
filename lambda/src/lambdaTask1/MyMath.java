package lambdaTask1;

import java.util.Scanner;

public class MyMath{
//   Calc 인터페이스 구현(두 정수를 입력했을 때 더한 값 혹은 뺸 값 나오도록 - 람다식)
   public static Calc operate(String oper) {
//	   방법1: 삼항연산자
//	   oper 값이 +면? 입력한 정수가 더해지도록, 아니면 빼지도록 하여 리턴
      return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;

//      방법2: 스위치문
      
//     리턴할 변수 선언
//      Calc calc = null;
      
//      스위치문을 통해 Calc 리턴값 구현
//      switch(oper) {
//      case "+":
//         calc = (n1, n2) -> n1 + n2;
//         break;
//      case "-":
//         calc = (n1, n2) -> n1 - n2;
//         break;
//      }
      
//      return calc;
   }
   
   public static void main(String[] args) {
	   
//	   메인에서 getOper 람다식으로 구현
//	   매개값인 식을 입력했을 때
      OperCheck operCheck = e -> {
//    	  문자열로 받을 변수 선언
         String result = "";
         
//         입력한 식에서 '-' 혹은 '+'이 있을 경우 result에 저장
         for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if(c == '-' || c == '+') {
               result += c;
            }
         }
//         +와 -를 문자열로 받은 값을 ""를 기준으로 칸을 나누어 배열로 리턴
         return result.split("");
      };
      
      String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
      String exampleMessage = "예)9+7-5";
      String expression = null;
      Scanner sc = new Scanner(System.in);
//      opers: +와 - 배열을 담을 배열, numbers: 정수를 담을 배열
      String[] opers = null, numbers = null;
      int number1 = 0, number2 = 0;
      
      System.out.println(message);
      System.out.println(exampleMessage);
      expression = sc.nextLine();
      
//      식이 입력되었을 때 +와 -는 opers 배열에 저장
      opers = operCheck.getOpers(expression);
//      정수 담을 배열 -> 입력한 식에서 + 혹은 - 기준으로 자른다.
      numbers = expression.split("\\+|\\-");
//      밑의 반복문 상으로 연산자 앞뒤에 number1과 number2 값이 위치해야 연산이 되나
//      연산자가 맨 앞에 위치할 경우 number[0]의 값이 빈문자열로 들어가므로 오류
//      따라서 number[0]의 값이 빈 문자열일 경우 연산자가 먼저 나오게 처리해주고
//      아닐 경우 그대로 number[0] 값이 들어가도록 해준다.
      number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
      
//      opers 반복하여 정수 연달아 계산
      for (int i = 0; i < opers.length; i++) {
//    	 number1이 음수면 첫번째 반복 하지 말아라
         if(i == 0 && number1 < 0) {continue;}
//         number2는 number[i] 다음 값
         number2 = Integer.parseInt(numbers[i + 1]);
//         number1 +(or -) number2 값 number1에 저장, 반복
         number1 = MyMath.operate(opers[i]).calc(number1, number2); 
      }
      
//      반복 후 최종적으로 계산된 값 출력
      System.out.println(number1);
   }   
}
