package lambdaTask1;

//�Լ��� �������̽�
@FunctionalInterface
public interface OperCheck {
//��ü ���� ���޹��� �� String[]���� �����ϴ� getOpers �߻�޼ҵ� ����
   public String[] getOpers(String expression);
}