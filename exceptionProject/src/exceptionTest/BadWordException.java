package exceptionTest;

//��� ���ܴ� Excpetion�� ����.
//Exception ����Ͽ� ���� ���� Ŭ���� ���� �� �ִ�.

//Exception ��� : �����Ϸ��� üũ(������ ����), ���������ϱ� �ȴ�!
//RuntimeException ��� : �����Ϸ��� üũ���� ����(���� �Ǵ� ��Ÿ�� ����), �������� �ؾ� �Ѵ�!
public class BadWordException extends /*RuntimeException*/ Exception {
	
	public BadWordException(String message) {
		super(message);
	}
}
