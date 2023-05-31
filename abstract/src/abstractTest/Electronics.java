package abstractTest;

// 추상클래스 선언
public abstract class Electronics {
//	추상 메소드
	public abstract void on();
	public abstract void off();
//	일반 메소드
	public void printProduct() {}
//	final 메소드
	public final void sos() {System.out.println("긴급전화 119 연락");}
}
