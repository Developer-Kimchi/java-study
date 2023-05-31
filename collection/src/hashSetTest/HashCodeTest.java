package hashSetTest;

import java.util.HashSet;

public class HashCodeTest {
   public static void main(String[] args) {
      Student student1 = new Student(1, "홍길동");
      Student student2 = new Student(1, "홍길동");
      
      System.out.println(student1.equals(student2));
      
      HashSet<Student> studentSet = new HashSet<Student>();
      
      studentSet.add(student1);
      studentSet.add(student2);
//      중복된 값을 가지고 있으므로 한 개만 해쉬셋에 담긴다
//      단, equals 오버라이드 필요
      System.out.println(studentSet.size());
   }
}