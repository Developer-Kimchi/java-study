package objectTest;

public class Student {
	private int number;
	private String name;
	
	public Student() {;}
	
//	getter setter �ҷ�����: alt + shift + s -> o
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//	alt + shift + s -> s(generate to string)
	@Override
//	toString ������
//	�ʵ尪�� �� ������ Ȯ��
	public String toString() {
//		
		return "Student [number=" + number + ", name=" + name + "]";
	}

	
//	equals ������
	@Override
	public boolean equals(Object obj) {
//		this�� obj�� �ּҰ��� ������
		if(this == obj) {
			return true;
			}
//		obj�� Student Ÿ���̸�(Ÿ�Ժ�)
		if(obj instanceof Student) {
//			Object���� number�� �����Ƿ�
//			�ٿ�ĳ������ �Ѵ�
			Student anotherStudent = (Student) obj;
//			�ʵ尪 ��
			if(this.number == anotherStudent.number) {
				return true;
			}
		}
		return false;
		}
	}
