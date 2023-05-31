package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//컬렉션 프레임워크 활용
public class OneOrZero {
   public int solution(String s) {
      int result = 0;
//      어레이리스트 문자열로 선언(datas)           문자열에서 0을 기준으로 스플릿하는 배열(0을 기준으로 1로 이루어진 문자열들이 칸으로 분리)
      ArrayList<String> datas = new ArrayList<String>(Arrays.asList(s.split("0")));
//                         datas -> stream() -> map을 통해 문자열 입력했을 때 길이로 리턴하도록 -> 구한 값을 리스트화
      List<Integer> lengths = datas.stream().map(String::length).collect(Collectors.toList())
//    	  stream()       ->           역정렬	                  -> 리스트화  
         .stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//    결과값      lengths 사이즈가 0이면 0을 리턴, 아니면 lengths의 0번째 방 리턴(1이 연속되는 구간중 최대값인 곳)
      result = lengths.size() == 0 ? 0 : lengths.get(0);
      
      return result;
   }
   
   public static void main(String[] args) {
      int result = new OneOrZero().solution("11100000111");
      System.out.println(result);
   }
}


