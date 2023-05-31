package lamp;

import java.time.LocalDateTime;
import java.util.StringJoiner;

public class TimerDeskLamp extends DeskLamp implements Runnable{

    final static int DELAY_MILLISECOND = 5000;

    private Thread offDelayThread; // ���� ���� ���� ������
    private Thread previousThread; // �������� ���� ������
    
//    TimerDeskLamp Ŭ������ ������ �ڵ带 ������ �ּ���.
    public void offDelay() {
//    	������ �����尡 ����ǰ� �ִٸ�
    	if(previousThread != null) {
//    		���ͷ�Ʈ ����
    		previousThread.interrupt();
    	}
    	
//    	���ο� �����带 offDelayThread�� �����Ѵ�.
    	offDelayThread = new Thread(this);
//    	���� ���� ���� ����
    	offDelayThread.start();
//    	�������� ������� previous Thread�� �������ش�.
    	previousThread = offDelayThread;
    }
    
    @Override
    public void run() {
//    	���� �ݺ�
    	while(true) {
    		try {
//    			5�� ��� ��
				Thread.sleep(DELAY_MILLISECOND);
//				������ ����
				turnOff();
//				������ ������ null�� �ٲپ��ش�
				previousThread = null;
				break;
			} catch (InterruptedException e) {
				System.out.println("Ÿ�̸� ����");
				break;
			}
    	}
    }
}