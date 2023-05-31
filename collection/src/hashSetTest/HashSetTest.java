package hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
   public static void main(String[] args) {
//	      코딩테스트 대비
//	   	  어레이리스트는 중복된 값도 함께 나옴
	      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 30, 30, 30, 20, 10, 90));
//	      해쉬셋 생성자에 datas(컬렉션) 넣는다
	      HashSet<Integer> dataSet = new HashSet<Integer>(datas);
//	      datas에 dataSet을 넣는다
	      datas = new ArrayList<Integer>(dataSet);
//	      중복값 없음
	      System.out.println(datas);
	      
	   
      HashSet<String> bloodTypeSet = new HashSet<String>();
      bloodTypeSet.add("A");
      bloodTypeSet.add("B");
      bloodTypeSet.add("O");
      bloodTypeSet.add("AB");
//      이상 중복된 값 무시
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
      bloodTypeSet.add("AB");
//    HashSet은 값을 가져올 수 없지만 iterator를 통해 가져온다
//    HashSet은 순서가 정해져 있지 않다.
      System.out.println(bloodTypeSet.toString());
//      iterator 방식으로 순서 부여      해쉬셋 객체.iterator();
      Iterator<String> iter = bloodTypeSet.iterator();
//      hasNext()를 통해 다음 값이 있는 지 검사하고, next()를 사용해서 값을 가져온다.
      while(iter.hasNext()) {
         System.out.println(iter.next());
      }
   }
}
