package lambdaTask1;

//	Print 인터페이스 선언(Functional Interface)
	@FunctionalInterface
	public interface PrintName {
//		getFullName() 추상메소드 선언(성과 이름 전달 받는다)
		public String getFullName(String lastName, String firstName);
}
