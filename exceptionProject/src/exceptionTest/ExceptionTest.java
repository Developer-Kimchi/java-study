package exceptionTest;

public class ExceptionTest {
   public static void main(String[] args) {
      
//      int[] arData = new int[5];
//      
//      try {
//         arData[5] = 10;
//      } catch (ArrayIndexOutOfBoundsException e) {
//         e.printStackTrace(); // 현재 시점에서 연계된 모든 코드부분의 라인 번호가 출력된다.
//         System.out.println(e.getMessage());
//         System.out.println("칸을 넘어갔습니다.");
//      }
      
      try {
         System.out.println(10 / 0);
      } catch (ArithmeticException e) {
         System.out.println("0으로 나눌 수 없습니다.");
//      } catch (Exception e) {
//         System.out.println("알 수 없는 오류");
      } finally {
         System.out.println("반드시 실행되어야 하는 문장");
      }
      
   }
}








