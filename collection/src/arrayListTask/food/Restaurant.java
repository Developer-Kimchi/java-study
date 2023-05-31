package arrayListTask.food;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Restaurant {
   ArrayList<Food> foods = DBConnecter.foods;
   
//   - ���� �߰�
   public void insert(Food food) {
      foods.add(food);
   }
   
//   - ���� �̸����� ���� ���� ��ȸ
   public String findKindByName(String name) {
      for (Food food : foods) {
//    	  foods�� ���İ� �Է��� ���� �̸��� ��ġ�ϸ�
         if(food.getName().equals(name)) {
//        	 ���� ���� ����
            return food.getKind();
         }
      }
//      ������ null ����
      return null;
   }
   
//   - ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
   public ArrayList<Food> findByKind(String kind) {
//	   ���� ��ȸ�� ArrayList ����
      ArrayList<Food> arFood = new ArrayList<Food>();
//      �Է��� ���� ������ DB�� ������ ��ġ�ϴٸ�
      for (Food food : foods) {
         if(food.getKind().equals(kind)) {
//        	ArrayList�� �߰�
            arFood.add(food);
         }
      }
//      �ݺ� ���� �� ����
      return arFood;
   }
   
//   - ���� ���� ���� �� ���� 10% ���
//   �Ű������� �޴� �� �̹� ������ �� ���� ������.
   public void update(Food food) {
//	  ������ ������ ��ü�� ���� ��ȸ
      for (Food foodInDB : foods) {
//    	  �Է��� ���� �̸��� DB�� ���� �̸��� ��ġ�ϸ�
         if(foodInDB.getName().equals(food.getName())) {
//        	 �Է��� ���� ������ DB�� ���� ���� ����
            foodInDB.setKind(food.getKind());
            foodInDB.setPrice(food.getPrice()); // ȭ�鿡�� ���ʿ� 10% ���� ���
//            foodInDB.setPrice((int)(food.getPrice() * 1.1));
         }
      }
   }
//   ���ϴ� ���� ��ȸ
   public Food select(String name) {
      for (Food food : foods) {
         if(food.getName().equals(name)) {
            return food;
         }
      }
      return null;
   }
   
//   - ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
   public int getCountByKind(String kind) {
//	   ���ϴ� ���� ���� ī��Ʈ �� ����
      int count = 0;
//      �Է��� ���� ���� �̸��� DB�� ���� ���� �̸� ��ġ�ϸ�
      for (Food food : foods) {
//    	  ���� ���� ��ȸ
         if(food.getKind().equals(kind)) {
//        	 ��ġ�ϸ� ī��Ʈ �߰�
            count++;
         }
      }
//      ī��Ʈ �� �� ����
      return count;
   }
}

