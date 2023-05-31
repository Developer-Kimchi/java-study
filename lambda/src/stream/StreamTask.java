package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
   
   public static int changeToInteger(int c) {
      return c - 48;
   }
   
   public static void main(String[] args) {
//      10~1까지 ArrayList에 담고 출력
//	    정수 담을 어레이 리스트 선언(datas)
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//	    인트스트림으로 정수 범위 정의 -> 맵에서 람다로 10 - 범위 내 정수 -> forEach로 datas에 구한 값 반복 추가
//      IntStream.range(0, 10).map(data -> 10 - data).forEach(datas::add);	   
//      System.out.println(datas);
      
//      1~10까지 ArrayList에 담고 출력
//	    정수 담을 어레이 리스트 선언(datas)
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//	    인트스트림 통해 범위 rangeClosed로 정해주고 forEach 통해 datas에 값 반복 추가
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);
      
//      ABCDEF를 각 문자별로 출력
//      String data = "ABCDEF";
//	    chars 사용 후 'forEach'에서 정수값을 문자값으로 형변환하여 출력
//      data.chars().forEach(c -> System.out.println((char)c));
      
//      1~100까지 중 홀수만 ArrayList에 담고 출력
//	    정수값 담을 어레이 리스트 객체 선언
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//	    인트스트림 rangeClosed로 1부터 100까지 범위 정해준다 -> filter통해 람다로 조건식 -> forEach로 datas에 값 추가
//      IntStream.rangeClosed(1, 100).filter(data -> data % 2 == 1).forEach(datas::add);
//      System.out.println(datas);
      
//      A~F까지 중 D제외하고 ArrayList에 담고 출력
//	    어레이 리스트 객체(캐릭터형)
//      ArrayList<Character> datas = new ArrayList<Character>();
//	    range로 범위 정해주고 map통해 람다로 삼항연산자 조건식(c값이 67보다 크다면 68은 패스) -> forEach에서 값을 문자형으로 변환
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(data -> datas.add((char)data));
//      System.out.println(datas);
      
//      5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk"), toLowerCase() 사용
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//	    stream().map()통해 datas내 문자열 값들을 전부 소문자로 변환해준다.
//      datas.stream().map(String::toLowerCase).forEach(System.out::println);
      
//      1~100까지 중 짝수만 ArrayList에 담고 출력
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//	    홀수와 방법은 같고 조건식만 짝수로 바꿔준다
//      IntStream.rangeClosed(1, 100).filter(data -> data % 2 == 0).forEach(datas::add);
//      System.out.println(datas);
      
//      "Apple", "banana", "Melon" 중 첫 번째 문자가 대문자인 문자열 출력
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//	    필터 통해 문자열 첫번째 값이 A~Z인 경우만 출력
//      datas.stream().filter(data -> data.charAt(0) >= 'A')
//                  .filter(data -> data.charAt(0) <= 'Z')
//                     .forEach(System.out::println);
      
//      한글을 정수로 변경
//      String hangle = "공일이삼사오육칠팔구";
//      String input = "일공이사";
//	    맵을 통해 한글 문자열에 있는 문자값을 인덱스 값으로 출력
//      input.chars().map(hangle::indexOf).forEach(System.out::print);      
      
//      정수를 한글로 변경 "1024" -> '1' - 48 = 1
//      String hangle = "공일이삼사오육칠팔구";
//      String input = "1024";
//	   맵을 통해 문자형 숫자를 정수형으로 변환해준다(메소드에 구현) -> 정수로 변환된 i값을 매개변수로 hangle 인덱스 값 접근하여 출력
//      input.chars().map(StreamTask::changeToInteger).forEach(i -> System.out.print(hangle.charAt(i)));
   }
}
