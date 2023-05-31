package variableTest;

public class FormatTest {
	public static void main(String[] args) {
	
//	서식 문자
//	반드시 따옴표 안에 작성한다.
		
//	%d : decimal 10진수 정수
//	%o : octal 8진수 정수
//	%x : hexadecimal 16진수 정수
//	%f : float
//	%c : character 문자
//	%s : string 문자열		
		
		
	String name = "김치윤";
	int age = 28;
	System.out.printf("이름 : %s\n", name);
	System.out.printf("나이 : %d살", age);
}
}
