package anonymous;

public class Computer {
	public static void main(String[] args) {
//		컴퓨터 클래스 메인메소드 내부에 익명클래스 선언되어있다(Inner)
//		클래스가 선언되어 있으나 이름은 없다
//		implements Game을 내부적으로 받음
//		익명클래스는 Game 클래스로 upcasting
		Game rpg = new Game() {
			
			@Override
			public void play() {
				System.out.println("사냥");
			}
			
			@Override
			public void exit() {
				System.out.println("조금만 기다리시면 보상이 도착해요.");
			}
		};
		
		rpg.play();
	}
}
