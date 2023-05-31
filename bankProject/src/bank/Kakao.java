package bank;

//잔액조회 재산 반토막
public class Kakao extends Bank{
   @Override
   public int showBalance() {
      this.money /= 2;
      return super.showBalance();
   }
}