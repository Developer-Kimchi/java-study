package interfaceTest;

public class Cat implements Animal {

	@Override
	public void sitDown() {
		System.out.println("앉지 않는다");
	}

	@Override
	public void showHands() {
		System.out.println("손은 준다. 가끔");
	}

	@Override
	public void touchNose() {
		System.out.println("못알아듣는다");
	}

	@Override
	public void waitNow() {
		System.out.println("안된다 그냥");
	}

	@Override
	public void poop() {
		System.out.println("화장실로 알아서 가서 잘 처리한다");
	}

}
