package codingTest;

import java.util.Scanner;

public class ThreadMain {
	public static void main(String[] args) {
//		������ ������ 3��
		final int SIZE = 3;
//		�ڿ� ������ Runnable ����
		Runnable mineral = new ThreadTask();
//		�Է¹��� ����
		Scanner sc = new Scanner(System.in);
//		������ ������ŭ �迭�� ����
		Thread[] threads = new Thread[SIZE];
//		�� �濡 ������ ����
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(mineral);
		}
		
		for (int i = 0; i < threads.length; i++) {
//			��ȣ �Է�
			threads[i].setName(sc.next());
//			����
			threads[i].start();
//			join()�� ���� ���� �Է��� �����尡 ���� ����ǵ��� �������ش�.
			try {threads[i].join();} catch (InterruptedException e) {;}
		}
	}
}


