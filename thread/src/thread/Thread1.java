package thread;
//쓰레드 클래스 상속
public class Thread1 extends Thread {
	String data;
	
	public Thread1() {;}


	public Thread1(String data) {
		super();
		this.data = data;
	}


	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {			
			try {
			System.out.println(data);
//			sleep: 쓰레드가 실행되는 것을 밀리세컨드 단위로 멈춰준다.
		      sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
