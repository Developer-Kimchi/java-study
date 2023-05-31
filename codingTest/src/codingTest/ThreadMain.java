package codingTest;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
//		실행할 스레드 3개
		final int SIZE = 3;
//		자원 공유할 Runnable 변수
		Runnable mineral = new ThreadTask();
//		입력받을 변수
		Scanner sc = new Scanner(System.in);
//		스레드 갯수만큼 배열로 선언
		Thread[] threads = new Thread[SIZE];
//		각 방에 스레드 선언
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(mineral);
		}
		
		for (int i = 0; i < threads.length; i++) {
//			번호 입력
			threads[i].setName(sc.next());
//			실행
			threads[i].start();
//			join()을 통해 먼저 입력한 스레드가 먼저 실행되도록 제어해준다.
			try {threads[i].join();} catch (InterruptedException e) {;}
		}
	}
}


