package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask {
   public static void main(String[] args) {
//      ��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���)
      
//      1. ��ǰ 1���� �����Ͽ� JSON �������� ����
      Product product = new Product("����", 1500, 85);
//      ���̽�������Ʈ Ÿ���� ��ü�� ������ ��ǰ ���� �ִ´�.
      JSONObject productJSON = new JSONObject(product);
      
//      2. JSON ������ ��ǰ ���� �� ��ǰ ��� ���
      try {
//    	  key�� ��ǰ�� ��� value�� �ҷ��´�.
//    	  JSONException
         System.out.println(productJSON.get("productStock"));
      } catch (JSONException e) {
         e.printStackTrace();
      }
      
//      3. ���� ���� ��ǰ ���� ����
//      discount ��ǰ ����
      Product discount = new Product("����", 800, 100);
//      ���̽� ��ü�� discount ���� ��´�
      JSONObject discountJSON = new JSONObject(discount);
//      ��ǰ ������ �ֱ� ���� products ���̽� ��ü�� ����
      JSONObject products = new JSONObject();

      
//      4. ���� ���� ��ǰ�� KEY���� discount�� ����
      try {
         products.put("product", productJSON);
         products.put("discount", discountJSON);
      } catch (JSONException e) {
         e.printStackTrace();
      }
      
//      5. JSON �������� ����
      System.out.println(products.toString());
      
//      6. JSON�� ������ �ʵ� �߰�
      try {
//         �ݵ�� ������ JSON��ü�� down casting���� ����ؾ� �Ѵ�!
//         discountJSON = ((JSONObject)products.get("discount")).put("discount", 50);
//    	  getJSONObject ���� ������ �� ����. �����ϴ� ���̽���ü�� ������ �ʵ带 ���
         discountJSON = products.getJSONObject("discount").put("discount", 50);
         System.out.println(discountJSON);
//         products ���� �ִ� ���� ��ǰ�� ������ �ʵ尡 ����� ������ �־��ش�.
         products.put("discount", discountJSON);
//      7. JSON ������ ��ǰ ���� �� ������ ���
//         System.out.println(((JSONObject)products.get("discount")).get("discount"));
         System.out.println(products.getJSONObject("discount").get("discount"));
      } catch (JSONException e) {
         e.printStackTrace();
      }
   }
}















