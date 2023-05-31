package castingTest;

//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 "자막 지원" 기능 사용
//영화라면 "4D" 기능 사용
//드라마라면 "굿즈" 기능 사용
public class CastingTask {
	public void checkVideo(Video video) {
//		video가 Animation -> Video로 업캐스팅 된 객체라면
		if(video instanceof Animation) {
//			다시 다운 캐스팅
			Animation animation = (Animation) video;
//			자식 필드 호출
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
//		Video타입의 배열로 객체 선언, 배열로 업캐스팅
		Video[] videos = {
				new Drama(),
				new Film(),
				new Animation()
		};

//		반복문 사용하여 checkVideo 메소드 호출(다운캐스팅)
		for(int i = 0; i < videos.length; i++) {
			castingTask.checkVideo(videos[i]);
		}
	}
}
