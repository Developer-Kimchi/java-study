package thread;

public class ThreadTest {
	public static void main(String[] args) {
//		함수형 인터페이스로 람다 구현 가능
		Runnable mineral = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {;}
			}
		};
		
		Thread t1 = new Thread(mineral, "?");
		Thread t2 = new Thread(mineral, "!");
		
		t1.start();
		
//		join을 사용한 쓰레드가 끝나고 나서 나머지 쓰레드가 실행된다.
//		단, 이미 join()전에 start()된 쓰레드는 멈출 수 없다.
		
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("메인쓰레드 종료");
		
//		Thread1 thread1 = new Thread1("★");
//		Thread1 thread2 = new Thread1("♥");
		
//		디폴트가 단일
//		운영체제는 인식을 못한다
//		thread1.run();
//		thread2.run();
		
//		스캐줄링
//		단일 -> 멀티
//		하나의 처리경로 -> 여러 개의 처리경로
//		thread1.start();
//		thread2.start();
	}
}
