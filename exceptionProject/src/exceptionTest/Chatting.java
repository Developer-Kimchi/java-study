package exceptionTest;

import java.util.Scanner;

public class Chatting {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("메세지: ");
		message = sc.nextLine();
		
		if(message.equals("바보")) {
//			예외 발생
			try {
//				예외 던지기(throw)
			throw new BadWordException("욕하지 마세요");
			} catch(BadWordException e) {
				for (int i = 0; i < message.length(); i++) {
					System.out.print("*");
				}
			}			
		}			
	}
}
