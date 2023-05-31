package arrayListTask.food;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Restaurant {
   ArrayList<Food> foods = DBConnecter.foods;
   
//   - 음식 추가
   public void insert(Food food) {
      foods.add(food);
   }
   
//   - 음식 이름으로 음식 종류 조회
   public String findKindByName(String name) {
      for (Food food : foods) {
//    	  foods상 음식과 입력한 음식 이름이 일치하면
         if(food.getName().equals(name)) {
//        	 음식 종류 리턴
            return food.getKind();
         }
      }
//      없으면 null 리턴
      return null;
   }
   
//   - 사용자가 원하는 종류의 음식 전체 조회
   public ArrayList<Food> findByKind(String kind) {
//	   음식 조회할 ArrayList 선언
      ArrayList<Food> arFood = new ArrayList<Food>();
//      입력한 음식 종류와 DB상 종류가 일치하다면
      for (Food food : foods) {
         if(food.getKind().equals(kind)) {
//        	ArrayList에 추가
            arFood.add(food);
         }
      }
//      반복 끝난 후 리턴
      return arFood;
   }
   
//   - 음식 종류 수정 후 가격 10% 상승
//   매개변수로 받는 건 이미 수정이 다 끝난 정보다.
   public void update(Food food) {
//	  수정한 정보와 교체할 음식 조회
      for (Food foodInDB : foods) {
//    	  입력한 음식 이름과 DB상 음식 이름이 일치하면
         if(foodInDB.getName().equals(food.getName())) {
//        	 입력한 음식 종류로 DB상 음식 종류 변경
            foodInDB.setKind(food.getKind());
            foodInDB.setPrice(food.getPrice()); // 화면에서 애초에 10% 가격 상승
//            foodInDB.setPrice((int)(food.getPrice() * 1.1));
         }
      }
   }
//   원하는 음식 조회
   public Food select(String name) {
      for (Food food : foods) {
         if(food.getName().equals(name)) {
            return food;
         }
      }
      return null;
   }
   
//   - 사용자가 원하는 종류의 음식 개수 조회
   public int getCountByKind(String kind) {
//	   원하는 종류 음식 카운트 할 변수
      int count = 0;
//      입력한 음식 종류 이름과 DB상 음식 종류 이름 일치하면
      for (Food food : foods) {
//    	  음식 종류 조회
         if(food.getKind().equals(kind)) {
//        	 일치하면 카운트 추가
            count++;
         }
      }
//      카운트 한 값 리턴
      return count;
   }
}

