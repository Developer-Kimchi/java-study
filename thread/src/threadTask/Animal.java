package threadTask;

public class Animal {
   
   public void makeSound(Runnable runnable) {
//	   ���� �����Ҹ� �迭�� ����
      String[] sounds = {"����", "����", "�߿�"};
//      ������ ��ü �迭           sounds �迭 ���� ��ŭ
      Thread[] threads = new Thread[sounds.length];
      
      for (int i = 0; i < threads.length; i++) {
//    	������ �迭[i] <- ���ʺ� ��ü, ��ü �̸� �����ڷ� ����
         threads[i] = new Thread(runnable, sounds[i]);
      }
      
      for (int i = 0; i < threads.length; i++) {
//    	  threads[i] ��ü ����
         threads[i].start();
         if(i != 0) {
//        	 ���� ���� -> ���� ����, join(������ �̹� ������, ���� ���� ������ �߿� ���) -> �߿� ����
            try {threads[i].join();} catch (InterruptedException e) {;}
         }
      }
      
   }
}

