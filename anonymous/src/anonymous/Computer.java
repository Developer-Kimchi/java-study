package anonymous;

public class Computer {
	public static void main(String[] args) {
//		��ǻ�� Ŭ���� ���θ޼ҵ� ���ο� �͸�Ŭ���� ����Ǿ��ִ�(Inner)
//		Ŭ������ ����Ǿ� ������ �̸��� ����
//		implements Game�� ���������� ����
//		�͸�Ŭ������ Game Ŭ������ upcasting
		Game rpg = new Game() {
			
			@Override
			public void play() {
				System.out.println("���");
			}
			
			@Override
			public void exit() {
				System.out.println("���ݸ� ��ٸ��ø� ������ �����ؿ�.");
			}
		};
		
		rpg.play();
	}
}
