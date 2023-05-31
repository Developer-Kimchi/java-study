package threadTask;

public class Animal {
   
   public void makeSound(Runnable runnable) {
//	   동물 울음소리 배열로 선언
      String[] sounds = {"어흥", "음메", "야옹"};
//      쓰레드 객체 배열           sounds 배열 길이 만큼
      Thread[] threads = new Thread[sounds.length];
      
      for (int i = 0; i < threads.length; i++) {
//    	쓰레드 배열[i] <- 러너블 객체, 객체 이름 생성자로 전달
         threads[i] = new Thread(runnable, sounds[i]);
      }
      
      for (int i = 0; i < threads.length; i++) {
//    	  threads[i] 객체 실행
         threads[i].start();
         if(i != 0) {
//        	 어흥 실행 -> 음메 실행, join(어흥은 이미 실행중, 음메 끝날 때까지 야옹 대기) -> 야옹 실행
            try {threads[i].join();} catch (InterruptedException e) {;}
         }
      }
      
   }
}

