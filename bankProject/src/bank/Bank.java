package bank;

public class Bank {

//   ������
//   ���¹�ȣ
//   �ڵ�����ȣ
//   ��й�ȣ
//   ����
   private String name;
   private String account;
   private String phoneNumber;
   private String password;
   protected int money;
   
   public Bank() {;}

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAccount() {
      return account;
   }

   public void setAccount(String account) {
      this.account = account;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public int getMoney() {
      return money;
   }

   public void setMoney(int money) {
      this.money = money;
   }

//   *static
//   ���¹�ȣ �ߺ��˻�
   
   public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
      Bank bank = null;

//	  � ���������� �ݺ����� ���� �˻�
      for (int i = 0; i < arrBank.length; i++) {
//    	  for�� ���� �ۿ����� j�� ���� ���� for�� �ۿ��� j ����
         int j = 0;
//    	 �� �� �� ����ŭ �ݺ����� ���� �˻��Ѵ�.
//    	 arrBank ����ŭ �˻��Ѵٸ� �ִ� 100ȸ �˻��ϴ� ���̹Ƿ� ��ȿ�����̴�.
         for (j = 0; j < arCount[i]; j++) {
//           ���� account�� arrBank �迭 �� �ִٸ�(�����ϴ� ���¶��)
            if(arrBank[i][j].getAccount().equals(account)) {
//             �´ٸ� arrBank ��ü ������ bank�� ��´�
               bank = arrBank[i][j];
               break;
            }
         }
//         j�� arCount�� ��ġ���� �ʴ´ٸ�(�� �����ϴ� ���°� �ƴ϶��) �ݺ� �ٷ� �����.
         if(j != arCount[i]) {
            break;
         }
      }
//      �� ���� bank ����
      return bank;
   }
   
   
//   �ڵ�����ȣ �ߺ��˻�
//   ������ checkAccount�� �����ϰ� account�� PhoneNumber�� ����
   public final static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
      Bank bank = null;
      
      for (int i = 0; i < arrBank.length; i++) {
         int j = 0;
         for (j = 0; j < arCount[i]; j++) {
            if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) {
               bank = arrBank[i][j];
               break;
            }
         }
         if(j != arCount[i]) {
            break;
         }
      }
//      �� ������ bank ����
      return bank;
   }
   
//   �α���
   public final static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
      Bank user = checkAccount(arrBank, arCount, account);
//      ���� user�� null�� �ƴ϶��(�� �����ϴ� ���¶��)
      if(user != null) {
//    	  password�� �Ѿ�� password ��ġ�ϸ�
         if(user.password.equals(password)) {
//        	 user ����
            return user;
         }
      }
//      ������ null ����
      return null;
   }
   
   
//   *�Ϲ�
//   �Ա�
   public void deposit(int money) {
      this.money += money;
   }
   
//   ���
   public void withdraw(int money) {
      this.money -= money;
   }
   
//   �ܾ���ȸ
   public int showBalance() {
      return money;
   }
   
}
