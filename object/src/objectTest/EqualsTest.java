package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Student student = new Student(1, "��ġ��");
		boolean isSame = student.equals(new Student(1, "��ġ��"));
		System.out.println(isSame);
	}
}
// �ּ��� ���� �ƴ� ���ϴ� �ʵ��� ���� ���ϰ� ���� ��