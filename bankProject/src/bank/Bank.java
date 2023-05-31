package bank;

public class Bank {

//   예금주
//   계좌번호
//   핸드폰번호
//   비밀번호
//   통장
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
//   계좌번호 중복검사
   
   public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
      Bank bank = null;

//	  어떤 은행인지를 반복문을 통해 검사
      for (int i = 0; i < arrBank.length; i++) {
//    	  for문 영역 밖에서도 j를 쓰기 위해 for문 밖에서 j 선언
         int j = 0;
//    	 그 후 고객 수만큼 반복문을 통해 검사한다.
//    	 arrBank 열만큼 검사한다면 최대 100회 검사하는 것이므로 비효율적이다.
         for (j = 0; j < arCount[i]; j++) {
//           만약 account가 arrBank 배열 상에 있다면(존재하는 계좌라면)
            if(arrBank[i][j].getAccount().equals(account)) {
//             맞다면 arrBank 전체 정보를 bank에 담는다
               bank = arrBank[i][j];
               break;
            }
         }
//         j와 arCount가 일치하지 않는다면(즉 존재하는 계좌가 아니라면) 반복 바로 멈춘다.
         if(j != arCount[i]) {
            break;
         }
      }
//      값 담은 bank 리턴
      return bank;
   }
   
   
//   핸드폰번호 중복검사
//   원리는 checkAccount와 동일하고 account만 PhoneNumber로 변경
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
//      값 저장한 bank 리턴
      return bank;
   }
   
//   로그인
   public final static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
      Bank user = checkAccount(arrBank, arCount, account);
//      만약 user가 null이 아니라면(즉 존재하는 계좌라면)
      if(user != null) {
//    	  password로 넘어가고 password 일치하면
         if(user.password.equals(password)) {
//        	 user 리턴
            return user;
         }
      }
//      없으면 null 리턴
      return null;
   }
   
   
//   *일반
//   입금
   public void deposit(int money) {
      this.money += money;
   }
   
//   출금
   public void withdraw(int money) {
      this.money -= money;
   }
   
//   잔액조회
   public int showBalance() {
      return money;
   }
   
}
