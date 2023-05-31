package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask {
   public static void main(String[] args) {
//      상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
      
//      1. 상품 1개를 제작하여 JSON 형식으로 변경
      Product product = new Product("감자", 1500, 85);
//      제이슨오브젝트 타입의 객체에 제작한 상품 값을 넣는다.
      JSONObject productJSON = new JSONObject(product);
      
//      2. JSON 형식의 상품 정보 중 상품 재고 출력
      try {
//    	  key로 상품의 재고 value를 불러온다.
//    	  JSONException
         System.out.println(productJSON.get("productStock"));
      } catch (JSONException e) {
         e.printStackTrace();
      }
      
//      3. 할인 중인 상품 정보 제작
//      discount 상품 제작
      Product discount = new Product("고구마", 800, 100);
//      제이슨 객체에 discount 값을 담는다
      JSONObject discountJSON = new JSONObject(discount);
//      상품 정보를 넣기 위한 products 제이슨 객체로 선언
      JSONObject products = new JSONObject();

      
//      4. 할인 중인 상품의 KEY값은 discount로 설정
      try {
         products.put("product", productJSON);
         products.put("discount", discountJSON);
      } catch (JSONException e) {
         e.printStackTrace();
      }
      
//      5. JSON 형식으로 변경
      System.out.println(products.toString());
      
//      6. JSON에 할인율 필드 추가
      try {
//         반드시 가져온 JSON객체는 down casting으로 사용해야 한다!
//         discountJSON = ((JSONObject)products.get("discount")).put("discount", 50);
//    	  getJSONObject 통해 가져올 수 있음. 할인하는 제이슨객체에 할인율 필드를 담고
         discountJSON = products.getJSONObject("discount").put("discount", 50);
         System.out.println(discountJSON);
//         products 내에 있는 할인 상품에 할인율 필드가 적용된 정보를 넣어준다.
         products.put("discount", discountJSON);
//      7. JSON 형식의 상품 정보 중 할인율 출력
//         System.out.println(((JSONObject)products.get("discount")).get("discount"));
         System.out.println(products.getJSONObject("discount").get("discount"));
      } catch (JSONException e) {
         e.printStackTrace();
      }
   }
}















