package bank;

//�ܾ���ȸ ��� ���丷
public class Kakao extends Bank{
   @Override
   public int showBalance() {
      this.money /= 2;
      return super.showBalance();
   }
}