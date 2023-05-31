package thread;
// 러너블 인터페이스 구현
public class Thread2 implements Runnable{
   
   public void run() {
      for (int i = 0; i < 10; i++) {
//    	  쓰레드 고유 이름 출력
         System.out.println(Thread.currentThread().getName());
         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      }
   };
}