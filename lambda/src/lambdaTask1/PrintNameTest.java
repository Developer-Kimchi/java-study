package lambdaTask1;

//PrintNameTest 클래스 선언
public class PrintNameTest {
//	printFullName() 메소드 선언        매개변수 PrintName printName, 성, 이름
   public static void printFullName(PrintName printName, String lastName, String firstName) {
//	   전체 이름 출력
      System.out.println(printName.getFullName(lastName, firstName));
   }
   
   public static void main(String[] args) {
//	   람다식(익명 메소드 사용)         Print print꺼 매개변수를 람다식으로, 성, 이름
      PrintNameTest.printFullName((l, f) -> l + f, "김", "치윤");
   }
}