package thread;
//������ Ŭ���� ���
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
//			sleep: �����尡 ����Ǵ� ���� �и������� ������ �����ش�.
		      sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
