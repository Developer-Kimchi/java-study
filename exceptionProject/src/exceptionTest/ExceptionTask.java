package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է¹ޱ�
//		- ���� �Է� ���·� ����
//		- q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
//		5�� ���� ���� �迭
		int[] arData = new int[5];
		String temp = null;
		
//		��ŭ �ݺ��� ���� ����, ���ѹݺ��ȴ�.
			for(int i=0; ;i++) {
				System.out.println(i + 1 + "��° ����[q: ������]");
				temp = sc.next();
//				q �Է��� ��� ����
				if(temp.toLowerCase().equals("q")) {break;}
				try {
					arData[i] = Integer.parseInt(temp);
				} catch (NumberFormatException e) {
					System.out.println("������ �Է����ּ���");
//					�ٽ� ���ư��� �� i�� �������� ���ϵ��� 
					i--;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("5���� ������ �Է��� �����մϴ�.");
//					������ �°� �����Ͽ� ���
					for(int j = 0; j < arData.length; j++) {
						System.out.print(arData[j] + " ");
					}
					
					break;
//					�� ��Ȳ ���� ���� ó��
				} catch(Exception e) {
					System.out.println("�ٽ� �õ����ּ���");
				}
				
			}
	}
}
