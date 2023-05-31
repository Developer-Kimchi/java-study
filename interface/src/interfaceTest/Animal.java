package interfaceTest;

public interface Animal {
	int eyes = 2;
	final static int nose = 1;
	
	abstract void sitDown();
//	인터페이스 내 모든 메소드가 추상메소드이므로 abstract 생략 가능
	void showHands();
	void touchNose();
	void waitNow();
	void poop();
}
