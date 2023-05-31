package copy;

public class CopyTest {
   public static void main(String[] args) {
//	   원본
      Address address = new Address("강남구", "서울시", "대한민국");
      User original = new User("John", "John", address);
//      얕은 복사
      User shallowCopy = new User(original.getFirstName(), original.getLastName(), original.getAddress());
//      깊은 복사
      User deepCopy = new User(original);
      
//      shallowCopy.getAddress().setStreet("도봉구");
      deepCopy.getAddress().setStreet("도봉구");
      
      System.out.println(original.getAddress().getStreet());
      
   }
}