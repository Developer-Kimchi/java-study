package lambdaTask1;

//	Print �������̽� ����(Functional Interface)
	@FunctionalInterface
	public interface PrintName {
//		getFullName() �߻�޼ҵ� ����(���� �̸� ���� �޴´�)
		public String getFullName(String lastName, String firstName);
}
