package operTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��) 183 -> 183 ���
//		   183.5 -> 183.5 ���
//		   183.0 -> 183.0 ���
	
		
	     double height = 0.0;
	      String message = "Ű: ", format = null;
	      Scanner sc = new Scanner(System.in);
	      boolean isInteger = false;
	      
	      System.out.print(message);
	      height = sc.nextDouble();
	      
	      isInteger = height - (int)height == 0;
	      format = isInteger ? "%.0f" : "%.2f";
	      
	      System.out.printf(format, height);
	   }

	}
