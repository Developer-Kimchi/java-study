package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Market {
   ArrayList<Fruit> fruits = DBConnecter.fruits;
   
//   - ���� �˻�
   public Fruit checkFruit(String name) {
//	   for each��
      for (Fruit fruit : fruits) {
//    	  �Է��� name�� fruits�� �����ϴ� ������ name�� ��ġ�Ѵٸ�
         if(fruit.getName().equals(name)) {
//        	 fruit ����
            return fruit;
         }
      }
//      �ƴϸ� null;
      return null;
   }
   
//   - ���� �߰�
   public void add(Fruit fruit) {
      fruits.add(fruit);
   }
   
//   - ���� ����
   public void remove(String name) {
//	   �Է��� ���� �̸��� �˻��Ͽ� DB�� ��ġ�ϴ� ������ fruit ������ ��´�
      Fruit fruit = checkFruit(name);
//    fruit ����  
      fruits.remove(fruit);
   }
//   - ���� ������ ��� ���ݺ��� ���� �� �˻�
//   1. ȭ�鿡�� ���� �Է�
   public boolean checkPrice(int price) {
      return getAverage() > price;
   }
   
//   2. DB���� ��ü ��ȸ
   public ArrayList<Fruit> findByPriceLessThanAverage() {
	//   ��հ����� ���� ������ ���� ArrayList ����
      ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
      
//      fruits�� ���� �� ��հ����� ���� ���� ��ȸ
      for (Fruit fruit : fruits) {
         if(fruit.getPrice() < getAverage()) {
//        	��հ����� ���� ���� �߰�
            arFruit.add(fruit);
         }
      }
      return arFruit;
   }
   
//   ��հ� ���ϱ�
   public double getAverage() {
      int total = 0;
      
//      total�� ���� ���� ����
      for (Fruit fruit : fruits) {
         total += fruit.getPrice();
      }
      
//      fruits �����ŭ ������� ������
      return (double)total / fruits.size();
   }
   
//   - ���� ��ü ��ȸ
   public ArrayList<Fruit> findAll() {
//	   ���� ��ü ������ ArrayList ����
      ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
      
//      fruits�� ��� �������� arFruit�� ��´�
      for (Fruit fruit : fruits) {
         arFruit.add(fruit);
      }
      
      return arFruit;
   }
   
//   - ���� �̸����� ���� ��ȸ
   public int findByName(String name) {
//	   ���ϰ˻� �� ��ġ�ϴ� ���� ���� ȣ��
      return checkFruit(name).getPrice();
   }
}
