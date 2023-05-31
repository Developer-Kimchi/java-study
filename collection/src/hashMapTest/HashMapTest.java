package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTest {
   public static void main(String[] args) {
//      ���̵�, ��й�ȣ, �̸�, ����
//	   ��: key, ��: value
      HashMap<String, Object> userMap = new HashMap<String, Object>();
//      ���̽� ��ü
      JSONObject userJSON = null;     
      String json = null;
      
      userMap.put("id", "kcy");
      userMap.put("password", "1234");
      userMap.put("name", "��ġ��");
      userMap.put("age", 20);
//      ���̽� ��ü�� userMap �� ����
      userJSON = new JSONObject(userMap);
      System.out.println(userJSON);
      
//      JSON��ü�� �����ϱ� ���� try catch�� ���
//      gender �߰�
      try {
         userJSON.put("gender", "none");
         System.out.println(userJSON);
//         userJSON ���ڿ����� json�� ��´�
         json = userJSON.toString();
         
      } catch (JSONException e) {
         e.printStackTrace();
      }
      
//      Ű���� "id"�� �ҷ����� value�� �ش��ϴ� �� ���
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
