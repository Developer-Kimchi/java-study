package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTest {
   public static void main(String[] args) {
//      아이디, 비밀번호, 이름, 나이
//	   왼: key, 오: value
      HashMap<String, Object> userMap = new HashMap<String, Object>();
//      제이슨 객체
      JSONObject userJSON = null;     
      String json = null;
      
      userMap.put("id", "kcy");
      userMap.put("password", "1234");
      userMap.put("name", "김치윤");
      userMap.put("age", 20);
//      제이슨 객체에 userMap 값 전달
      userJSON = new JSONObject(userMap);
      System.out.println(userJSON);
      
//      JSON객체에 접근하기 위해 try catch문 사용
//      gender 추가
      try {
         userJSON.put("gender", "none");
         System.out.println(userJSON);
//         userJSON 문자열값을 json에 담는다
         json = userJSON.toString();
         
      } catch (JSONException e) {
         e.printStackTrace();
      }
      
//      키값인 "id"를 불러오면 value에 해당하는 값 출력
      try {
         System.out.println(userJSON.get("id"));
      } catch (JSONException e) {
         e.printStackTrace();
      }

      try {
         userJSON = new JSONObject(json);
         System.out.println(userJSON.get("id"));
         
      } catch (JSONException e) {
         e.printStackTrace();
      }
   }
}
