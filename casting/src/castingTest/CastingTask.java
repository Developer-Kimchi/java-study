package castingTest;

//���ø���
//�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
//����ڰ� ������ ������
//�ִϸ��̼��̶�� "�ڸ� ����" ��� ���
//��ȭ��� "4D" ��� ���
//��󸶶�� "����" ��� ���
public class CastingTask {
	public void checkVideo(Video video) {
//		video�� Animation -> Video�� ��ĳ���� �� ��ü���
		if(video instanceof Animation) {
//			�ٽ� �ٿ� ĳ����
			Animation animation = (Animation) video;
//			�ڽ� �ʵ� ȣ��
			animation.printSubtitle();
		}else if(video instanceof Drama) {
			Drama drama = (Drama) video;
			drama.sellGoods();
		}else if(video instanceof Film) {
			Film film = (Film) video;
			film.moveChair();
		}
	}
	
	public static void main(String[] args) {
		CastingTask castingTask = new CastingTask();
//		VideoŸ���� �迭�� ��ü ����, �迭�� ��ĳ����
		Video[] videos = {
				new Drama(),
				new Film(),
				new Animation()
		};

//		�ݺ��� ����Ͽ� checkVideo �޼ҵ� ȣ��(�ٿ�ĳ����)
		for(int i = 0; i < videos.length; i++) {
			castingTask.checkVideo(videos[i]);
		}
	}
}
