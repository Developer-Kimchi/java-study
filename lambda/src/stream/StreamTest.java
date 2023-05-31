package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public Integer getTwoTimes(Integer number) {
		return number * 2;
	}
	
	public boolean checkEven(int number) {
		return number % 2 == 0;
	}
	
	public int change(int number) {
		return 10 - number;
	}
	
	public static void main(String[] args) {
//		Arrays.asList()
//		배열을 List로 변경가능
//		Integer[] arData = {10, 20, 30, 40, 50};
//		여러 개의 값을 List로 변경가능
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//		System.out.println(datas.toArray()[0]);
//		System.out.println(datas);
		
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		StreamTest streamTest = new StreamTest();
		
//		forEach() : 반복
//		여러 값을 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
//		forEach() 메소드에는 Consumer 인터페이스 타입의 값을 전달해야 한다.
//		Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//		매개변수에는 컬렉션 객체 안에 있는 값들이 순서대로 담기고,
//		화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
//		datas.stream().forEach(data -> System.out.println(data));
//		자주 쓰이는 메소드이기 때문에 stream 생략하고도 사용할 수 있게 되어 있음.
//		datas.forEach(data -> System.out.println(data));
//		객체(or 클래스)::참조메소드
//		datas.forEach(System.out::println);
		
//		map() : 기존 값 변경
//		ArrayList<User> users = new ArrayList<User>(Arrays.asList(new User("김치윤", 20), new User("홍길동", 20)));
//							객체변수 -> 실행할메소드
//		datas.stream().map(data -> data * 2).forEach(System.out::println);
//		메소드가 static이 아니라면 오류. 주소 전달할 객체 필요
//		메소드를 클래스 안에 만들어놓고, 객체::참조메소드 통해 출력
//		datas.stream().map(streamTest::getTwoTimes).forEach(System.out::println);		
//		users.stream().map(User::getAge).forEach(System.out::println);
//		변경: map, 반복: forEach
		
//		range(inclusive, exclusive)
//		rangeClosed(inclusive, inclusive)
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		인트스트림 통해 접근
//		IntStream.range(1, 10).forEach(System.out::println);
//		IntStream.rangeClosed(1, 10).forEach(System.out::println);
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
		
//		chars(): 문자열을 IntStream으로 변경
//		String data = "ABC";
//		A, B, C의 아스키 코드값으로 출력된다
//		data.chars().forEach(System.out::println);
//		인트스트림은 형변환을 해도 무조건 정수로 리턴된다.
//		data.chars().map(c -> (char)c).forEach(System.out::println);
//		forEach를 통해 출력할 때 형변환을 해주어야 문자값으로 출력이 된다.
//		data.chars().forEach(c -> System.out.println((char)c));
		
//		filter(): 조건식이 true일 경우만 추출☆☆
//		StreamTest streamTest = new StreamTest();
//		IntStream.range(0, 10).filter(streamTest::checkEven).forEach(System.out::println);
		
////		sorted(): 정렬
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		StreamTest streamTest = new StreamTest();
//		IntStream.rangeClosed(0, 9).map(streamTest::change).forEach(datas::add);
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		System.out.println(datas);
//		datas.stream().sorted().forEach(System.out::println);
//		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		collect(): 결과를 다양한 타입으로 리턴해준다.
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 30, 15));
//		System.out.println(datas.stream().map(String::valueOf).collect(Collectors.joining(":")));
		
		List<Integer> datas = new ArrayList<Integer>(Arrays.asList(30, 20, 90, 40, 80));
//		컬렉션에서는 Stream에 있는 sorted를 사용하지 않고 sort를 사용하여 직접 접근한 주소를 정렬시킨다.
//		오름차순으로 정렬해준다.
//		datas.sort(null);
//		역정렬
//		datas.sort(Collections.reverseOrder());
//		System.out.println(datas);
		List<Integer> results = datas.stream().sorted().collect(Collectors.toList());
		System.out.println(results);
		
//		System.out.println(datas.stream().map(String::valueOf).collect(Collectors.joining(", ")));
		
	}
}


