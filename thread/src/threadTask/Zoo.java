package threadTask;

public class Zoo {
   public static void main(String[] args) {
//	   메인에서 매개변수인 Runnable을 람다로 구현
      new Animal().makeSound(() -> {
         for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {Thread.sleep(500);} catch (InterruptedException e) {;}
         }
      });
   }
}