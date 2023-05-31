package lambdaTask1;

import java.util.Scanner;

public class MyMath{
//   Calc �������̽� ����(�� ������ �Է����� �� ���� �� Ȥ�� �A �� �������� - ���ٽ�)
   public static Calc operate(String oper) {
//	   ���1: ���׿�����
//	   oper ���� +��? �Է��� ������ ����������, �ƴϸ� �������� �Ͽ� ����
      return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;

//      ���2: ����ġ��
      
//     ������ ���� ����
//      Calc calc = null;
      
//      ����ġ���� ���� Calc ���ϰ� ����
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
	   
//	   ���ο��� getOper ���ٽ����� ����
//	   �Ű����� ���� �Է����� ��
      OperCheck operCheck = e -> {
//    	  ���ڿ��� ���� ���� ����
         String result = "";
         
//         �Է��� �Ŀ��� '-' Ȥ�� '+'�� ���� ��� result�� ����
         for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if(c == '-' || c == '+') {
               result += c;
            }
         }
//         +�� -�� ���ڿ��� ���� ���� ""�� �������� ĭ�� ������ �迭�� ����
         return result.split("");
      };
      
      String message = "������ ����, ������ ���� ���� �Է��ϼ���.";
      String exampleMessage = "��)9+7-5";
      String expression = null;
      Scanner sc = new Scanner(System.in);
//      opers: +�� - �迭�� ���� �迭, numbers: ������ ���� �迭
      String[] opers = null, numbers = null;
      int number1 = 0, number2 = 0;
      
      System.out.println(message);
      System.out.println(exampleMessage);
      expression = sc.nextLine();
      
//      ���� �ԷµǾ��� �� +�� -�� opers �迭�� ����
      opers = operCheck.getOpers(expression);
//      ���� ���� �迭 -> �Է��� �Ŀ��� + Ȥ�� - �������� �ڸ���.
      numbers = expression.split("\\+|\\-");
//      ���� �ݺ��� ������ ������ �յڿ� number1�� number2 ���� ��ġ�ؾ� ������ �ǳ�
//      �����ڰ� �� �տ� ��ġ�� ��� number[0]�� ���� ���ڿ��� ���Ƿ� ����
//      ���� number[0]�� ���� �� ���ڿ��� ��� �����ڰ� ���� ������ ó�����ְ�
//      �ƴ� ��� �״�� number[0] ���� ������ ���ش�.
      number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
      
//      opers �ݺ��Ͽ� ���� ���޾� ���
      for (int i = 0; i < opers.length; i++) {
//    	 number1�� ������ ù��° �ݺ� ���� ���ƶ�
         if(i == 0 && number1 < 0) {continue;}
//         number2�� number[i] ���� ��
         number2 = Integer.parseInt(numbers[i + 1]);
//         number1 +(or -) number2 �� number1�� ����, �ݺ�
         number1 = MyMath.operate(opers[i]).calc(number1, number2); 
      }
      
//      �ݺ� �� ���������� ���� �� ���
      System.out.println(number1);
   }   
}
