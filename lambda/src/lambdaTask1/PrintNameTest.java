package lambdaTask1;

//PrintNameTest Ŭ���� ����
public class PrintNameTest {
//	printFullName() �޼ҵ� ����        �Ű����� PrintName printName, ��, �̸�
   public static void printFullName(PrintName printName, String lastName, String firstName) {
//	   ��ü �̸� ���
      System.out.println(printName.getFullName(lastName, firstName));
   }
   
   public static void main(String[] args) {
//	   ���ٽ�(�͸� �޼ҵ� ���)         Print print�� �Ű������� ���ٽ�����, ��, �̸�
      PrintNameTest.printFullName((l, f) -> l + f, "��", "ġ��");
   }
}