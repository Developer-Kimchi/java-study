package exceptionTest;

import java.util.Scanner;

public class Chatting {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("�޼���: ");
		message = sc.nextLine();
		
		if(message.equals("�ٺ�")) {
//			���� �߻�
			try {
//				���� ������(throw)
			throw new BadWordException("������ ������");
			} catch(BadWordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.print("*");
				}
			}			
		}			
	}
}
