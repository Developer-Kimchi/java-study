package inheritanceTest;

class Human{
	String name;
	
//	�⺻ �����ڴ� ���� �����Ѵ�.
	public Human() {;}
	
	public Human(String name) {
		super();
		this.name = name;
	}
	
	void eat() {
		System.out.println("�Ա�");
	}
	
	void sleep() {
		System.out.println("�ڱ�");
	}
	
	void walk() {
		System.out.println("�� �߷� �ȱ�");
	}
}

class Monkey extends Human{
	@Override // ������̼�
	void walk() {
		super.walk();
		System.out.println("�� �߷� �ȴ´�");
	}
}
public class InheritanceTest2 {
	public static void main(String[] args) {
		Human ��ġ�� = new Human();
		Monkey kingkong = new Monkey();
		kingkong.walk();
		��ġ��.walk();
	}
}
