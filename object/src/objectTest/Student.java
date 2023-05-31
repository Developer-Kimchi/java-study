package objectTest;

public class Student {
	private int number;
	private String name;
	
	public Student() {;}
	
//	getter setter 불러오기: alt + shift + s -> o
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
//	toString 재정의
//	필드값이 잘 들어갔는지 확인
	public String toString() {
//		
		return "Student [number=" + number + ", name=" + name + "]";
	}

	
//	equals 재정의
	@Override
	public boolean equals(Object obj) {
//		this와 obj와 주소값이 같으면
		if(this == obj) {
			return true;
			}
//		obj가 Student 타입이면(타입비교)
		if(obj instanceof Student) {
//			Object에는 number가 없으므로
//			다운캐스팅을 한다
			Student anotherStudent = (Student) obj;
//			필드값 비교
			if(this.number == anotherStudent.number) {
				return true;
			}
		}
		return false;
		}
	}
