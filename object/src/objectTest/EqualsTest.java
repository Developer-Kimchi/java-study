package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Student student = new Student(1, "김치윤");
		boolean isSame = student.equals(new Student(1, "김치윤"));
		System.out.println(isSame);
	}
}
// 주소의 값이 아닌 원하는 필드의 값을 비교하고 싶을 떄