package staticTest;

class Data {
	int data = 10; //인스턴스 변수
//	모든 객체가 공유해야 할 떄 static 필드를 선언한다.
	static int data_s = 10; // 클래스 변수
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data();
		
		Data.data_s = 20;
		System.out.println(Data.data_s);
		
		data1.data = 20;
		System.out.println(data2.data);
		
//		Data data = new Data();
//		
//		System.out.println(data.data);
//		System.out.println(Data.data_s);
//		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		
//		data = new Data();
//		
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		data.increase_s();
//		
////		data.increase();
////		data.increase();
////		data.increase();
////		data.increase();
//		
//		data = new Data();
//		
//		data.increase();
//		data.increase();
//		data.increase();
//		data.increase();
	}
}
