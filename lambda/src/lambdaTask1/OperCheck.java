package lambdaTask1;

//함수형 인터페이스
@FunctionalInterface
public interface OperCheck {
//전체 식을 전달받은 후 String[]으로 리턴하는 getOpers 추상메소드 선언
   public String[] getOpers(String expression);
}