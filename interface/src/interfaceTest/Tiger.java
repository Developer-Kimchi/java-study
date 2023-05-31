package interfaceTest;

public class Tiger extends AnimalAdapter {
	
	@Override
	public void showHands() {
		System.out.println("손을 준다.");
	}
	
	@Override
	public void poop() {
		System.out.println("알아서 화장실에서 잘 처리한다");
	}
}
