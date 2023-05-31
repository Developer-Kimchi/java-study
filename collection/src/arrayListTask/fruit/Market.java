package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Market {
   ArrayList<Fruit> fruits = DBConnecter.fruits;
   
//   - 과일 검사
   public Fruit checkFruit(String name) {
//	   for each문
      for (Fruit fruit : fruits) {
//    	  입력한 name이 fruits상 존재하는 과일의 name과 일치한다면
         if(fruit.getName().equals(name)) {
//        	 fruit 리턴
            return fruit;
         }
      }
//      아니면 null;
      return null;
   }
   
//   - 과일 추가
   public void add(Fruit fruit) {
      fruits.add(fruit);
   }
   
//   - 과일 삭제
   public void remove(String name) {
//	   입력한 과일 이름을 검사하여 DB상 일치하는 정보를 fruit 변수에 담는다
      Fruit fruit = checkFruit(name);
//    fruit 제거  
      fruits.remove(fruit);
   }
//   - 과일 가격이 평균 가격보다 낮은 지 검사
//   1. 화면에서 가격 입력
   public boolean checkPrice(int price) {
      return getAverage() > price;
   }
   
//   2. DB에서 전체 조회
   public ArrayList<Fruit> findByPriceLessThanAverage() {
	//   평균가보다 낮은 과일을 담을 ArrayList 선언
      ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
      
//      fruits상 과일 중 평균가보다 낮은 과일 조회
      for (Fruit fruit : fruits) {
         if(fruit.getPrice() < getAverage()) {
//        	평균가보다 낮은 과일 추가
            arFruit.add(fruit);
         }
      }
      return arFruit;
   }
   
//   평균가 구하기
   public double getAverage() {
      int total = 0;
      
//      total에 과일 가격 축적
      for (Fruit fruit : fruits) {
         total += fruit.getPrice();
      }
      
//      fruits 사이즈만큼 평균으로 나누기
      return (double)total / fruits.size();
   }
   
//   - 과일 전체 조회
   public ArrayList<Fruit> findAll() {
//	   과일 전체 보여줄 ArrayList 선언
      ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
      
//      fruits에 담긴 과일정보 arFruit에 담는다
      for (Fruit fruit : fruits) {
         arFruit.add(fruit);
      }
      
      return arFruit;
   }
   
//   - 과일 이름으로 가격 조회
   public int findByName(String name) {
//	   과일검사 후 일치하는 과일 가격 호출
      return checkFruit(name).getPrice();
   }
}
