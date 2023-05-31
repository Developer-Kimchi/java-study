package arrayListTask.love;

import java.util.ArrayList;
import java.util.Collections;

import arrayListTask.DBConnecter;

public class DateApp {
   ArrayList<Love> loves = DBConnecter.loves;
   
//   - 이상형 추가
   public void insert(Love love) {
      loves.add(love);
   }
   
//   - 사용자가 원하는 나이의 이상형 목록 조회
   public ArrayList<Love> findByAge(int age){
//	   원하는 나이의 이상형 목록 추릴 ArrayList 선언
      ArrayList<Love> loves = new ArrayList<Love>();
      
//      age 같은지 검사
      for (Love love : loves) {
         if(love.getAge() == age) {
//        	 ArrayList에 해당하는 나이의 이상형 추가
            loves.add(love);
         }
      }
//      구한 값 리턴
      return loves;
   }
//   - 이상형의 나이 수정
   public void update(Love love) {
//	   DB상 이상형 조회
      for (Love loveInDB : loves) {
//    	  DB상 이상형과 입력한 이상형이 일치하면
         if(loveInDB.getNumber() == love.getNumber()) {
//        	 변경한 나이로 DB상 나이를 바꿔준다
            loveInDB.setAge(love.getAge());
            break;
         }
      }
   }
   
//   - 이상형 나이 순 정렬
   public ArrayList<Love> sortByAge() {
//      대입 연산자로 직접 주소를 받으면 mutable이기 때문에,
//      다른 곳에서 원본을 모두 수정할 수 있다.
//      하지만 이런 방식으로 설계를 하면, 어디에서 원본을 수정했는 지 알 수 없다.
      
//      얕은 복사를 사용하면 직접 값을 하나씩 복사해서 오기 때문에,
//      다른 곳에서 필드를 수정해도 원본이 바뀌지 않는다.
//      하지만, 만약 원본 필드에 객체가 선언되어 있다면 얕은 복사를 통해 해당 객체의 주소값은 그대로 대입이 된다.
//      따라서, 원본 필드에 선언된 객체가 변경된다면, 얕은 복사된 객체들도 해당 정보는 변경된다.
      
//      필드 안에 또 다른 객체가 선언되어 있으면(이하 "객체 그래프") 깊은 복사가 필요하다.
//      실제 주소를 그대로 받는 것이 아니라 객체 그래프 만큼 new를 사용하여 얕은 복사를 진행해야 한다.
//      이렇게 객체 그래프일 경우에는 얕은 복사를 사용하지 않고 깊은 복사를 통해 immutable의 목적을 달성해야 한다.
	   
//	   깊은 복사는 얕은 복사를 n번 하는 것
      
//	   원본 DB를 그대로 두기 위해 출력할 값은 복사한다.
      ArrayList<Love> copyLoves = (ArrayList<Love>)loves.clone(); // 얕은 복사
      ArrayList<Integer> ages = new ArrayList<Integer>();
      ArrayList<Love> result = new ArrayList<Love>();
      
//      ages에 이상형 나이 담기
      for (Love love : loves) {
         ages.add(love.getAge());
      }
      
      Collections.sort(ages);
      Collections.reverse(ages);
      
//      복사한 값 result에 담아 리턴
      for (Integer age : ages) {
         for (Love love : copyLoves) {
            if(love.getAge() == age) {
               result.add(love);
//               중복 피하기 위해 제거해준다
               copyLoves.remove(love);
               break;
            }
         }
      }
      return result;
   }
}

