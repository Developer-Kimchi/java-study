package exceptionTest;

//모든 예외는 Excpetion이 조상.
//Exception 상속하여 직접 예외 클래스 만들 수 있다.

//Exception 상속 : 컴파일러가 체크(컴파일 오류), 강제종료하기 싫다!
//RuntimeException 상속 : 컴파일러가 체크하지 않음(빌드 또는 런타임 오류), 강제종료 해야 한다!
public class BadWordException extends /*RuntimeException*/ Exception {
	
	public BadWordException(String message) {
		super(message);
	}
}
