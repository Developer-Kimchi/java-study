package codingTest;

// 3개의 쓰레드가 있다.
// Thread1, Thread2, Thread3
// 사용자가 입력한 순서대로 각 알맞는 문자열이 출력된다.

// 입력 예) 3 1 2
// 출력 예) third first second

// 단, Thread들은 항상 1, 2, 3 순서로 실행되어야 한다.

// Thread1 : third
// Thread2 : first
// Thread3 : second

// 출력 시 쓰레드의 번호도 출력할 경우 가산점으로 처리한다.

public class ThreadTask implements Runnable{
	
//	쓰레드 번호
	public static int count;
	
	public ThreadTask() {;}

	public void printFirst(Runnable first) {
		first.run(); // 수정 금지
	}

	public void printSecond(Runnable second) {
		second.run(); // 수정 금지
	}

	public void printThird(Runnable third) {
		third.run(); // 수정 금지
	}
	
	@Override
	public void run() {
//				메소드 이름, 스위치문 활용
		switch(Thread.currentThread().getName()) {
//		입력한 숫자를 각 케이스별로 분류, 람다로 구현
		case "1":
			printFirst(() -> System.out.println("Thread" + ++count + " : first"));
			break;
		case "2":
			printSecond(() -> System.out.println("Thread" + ++count + " : second"));
			break;
		case "3":
			printThird(() -> System.out.println("Thread" + ++count + " : third"));
			break;
		}
		
	}
}

