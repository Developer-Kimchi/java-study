package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {2, 4, 5, 6, 8};
		
		System.out.println(arData);
//		�ּҰ�
		System.out.println(arData.length);
//		�迭�� ����
		
		System.out.println("==============================");
		
		for(int i=0; i<arData.length; i++) {
			System.out.println(arData[i]);
		}
//		�迭 �� �� ���
		
		System.out.println("===============================");
		
		for(int i=0; i<arData.length; i++) {
			arData[i] = 5 - i;
			System.out.println(arData[i]);
		}
	}
}
