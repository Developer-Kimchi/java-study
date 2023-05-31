package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData = {2, 4, 5, 6, 8};
		
		System.out.println(arData);
//		주소값
		System.out.println(arData.length);
//		배열의 길이
		
		System.out.println("==============================");
		
		for(int i=0; i<arData.length; i++) {
			System.out.println(arData[i]);
		}
//		배열 내 값 출력
		
		System.out.println("===============================");
		
		for(int i=0; i<arData.length; i++) {
			arData[i] = 5 - i;
			System.out.println(arData[i]);
		}
	}
}
