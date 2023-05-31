package lamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class TimerDeskLamp extends DeskLamp implements Runnable{

    final static int DELAY_MILLISECOND = 5000;

    private Thread offDelayThread; // 전원 끄기 예약 쓰레드
    private Thread previousThread; // 실행중인 예약 쓰레드
    
//    TimerDeskLamp 클래스의 나머지 코드를 구현해 주세요.
    public void offDelay() {
//    	기존에 스레드가 실행되고 있다면
    	if(previousThread != null) {
//    		인터럽트 실행
    		previousThread.interrupt();
    	}
    	
//    	새로운 스레드를 offDelayThread에 생성한다.
    	offDelayThread = new Thread(this);
//    	전원 끄기 예약 실행
    	offDelayThread.start();
//    	실행중인 스레드는 previous Thread에 저장해준다.
    	previousThread = offDelayThread;
    }
    
    @Override
    public void run() {
//    	무한 반복
    	while(true) {
    		try {
//    			5초 대기 후
				Thread.sleep(DELAY_MILLISECOND);
//				전원을 끈다
				turnOff();
//				실행한 스레드 null로 바꾸어준다
				previousThread = null;
				break;
			} catch (InterruptedException e) {
				System.out.println("타이머 리셋");
				break;
			}
    	}
    }
}