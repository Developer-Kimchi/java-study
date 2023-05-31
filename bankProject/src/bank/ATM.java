package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
      String[] bankNames = {"신한은행", "국민은행", "카카오뱅크"};
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[3];
      final int ACCOUNT_LENGTH = 6;
      
      String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
      String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
      Scanner sc = new Scanner(System.in);
//      계좌번호 생성 위한 랜덤 클래스
      Random random = new Random();
      String account = "", password = null, phoneNumber = null;
      Bank user = null;
      int money = 0;
      int i = 0, choice = 0;
      
      
      while(true) { 
         System.out.println(message);
         i = sc.nextInt();
         
         if(i == 4) {break;}
//         아래에서 banks 인덱스값에 접근해야 하므로 i - 1
         i--;
         
         while(true) {
//        	 account 문자열은 초기화 시켜준다
            account = "";
            Bank[] banks = {new Shinhan(), new Kookmin(), new Kakao()};
            
            System.out.println(menu);
            choice = sc.nextInt();
            
            if(choice == 6) {break;}
            
            switch(choice) {
            case 1: // 계좌개설
               if(arCount[i] == 100) {System.out.println("더 이상 계좌를 개설할 수 없는 은행입니다."); break;}
               
               user = banks[i];
               

               
//               while문 안에서 random 계좌번호 생성 및 중복검사
//               언제 끝날 지 모르므로 while문 사용
               while(true) {
   //               계좌번호가 0부터 시작 가능
   //               for (int j = 0; j < ACCOUNT_LENGTH; j++) {
   //                  account += random.nextInt(10);
   //               }
                  
   //               계좌번호가 1부터 시작 가능
   //               100000 ~ 999999 -> 0 ~ 899999
                  account += random.nextInt(900000) + 100000;
//                  은행마다 맨앞 고유번호 주고 싶을 때
                  account = i + 1 + account;
                  
//                  중복검사 통해 이미 있는 account인지 확인하고 없으면 while문 탈출
                  if(Bank.checkAccount(arrBank, arCount, account) == null) {
                     break;
                  }
               }
               
//               계좌번호 생성 완료
               user.setAccount(account);
//               예금주명 직접 입력하여 생성
               System.out.print("예금주: ");
               user.setName(sc.next());
               
               while(true) {
                  System.out.print("비밀번호[4자리]: ");
                  password = sc.next();
                  
//                  패스워드 길이가 4개일 때만 while문 탈출
                  if(password.length() == 4) {break;}
               }
//               패스워드 생성
               user.setPassword(password);
               
               while(true) {
                  System.out.print("핸드폰 번호['-' 제외]");
                  phoneNumber = sc.next();
//                 입력한 값에 - 있을 경우 해당 글자는 아예 없는 것으로 replace 한다
                  phoneNumber = phoneNumber.replaceAll("-", "");
//                  휴대폰 번호가 11자리이고 기존에 없는 번호일 경우에만 while문 탈출
                  if(phoneNumber.length() == 11 && Bank.checkPhoneNumber(arrBank, arCount, phoneNumber) == null) {break;}
               }
               
//               전화번호 생성
               user.setPhoneNumber(phoneNumber);
               
//               생성한 계좌번호, 예금주명, 패스워드, 전화번호가 만들어졌으면 user의 값을 DB에 저장한다.
               arrBank[i][arCount[i]] = user;
//               고객 수 증가
               arCount[i]++;
               
               System.out.println(bankNames[i] + ", 환영한다.");
               System.out.println("너의 계좌번호: "+ account);
               
               break;
            case 2: // 입금하기
               System.out.print("계좌번호: ");
               account = sc.next();
               
               System.out.print("비밀번호: ");
               password = sc.next();
               
               // 저장소와 고객수, 입력받은 계좌번호와 비밀번호를 전달하면
               // 로그인 검사를 통해 로그인 성공 시 회원 객체를 전달해준다.
               user = Bank.login(arrBank, arCount, account, password);
//               user가 null이 아니라면, 즉 존재하는 user라면
               if(user != null) {
//            	   문자열 인덱스 0에 있는 값이(은행 고유 번호) 선택한 은행의 값과 일치하다면
                  if(user.getAccount().charAt(0) - 48 == i + 1) {
                     System.out.print("입금액: ");
                     money = sc.nextInt();
//                     입금액 -일 경우 다시 입력
                     if(money <= 0) {
                        System.out.println("다시 입력해주세요.");
                        break;
                     }
                     user.deposit(money);
                  }else {
                     System.out.println("개설한 은행에서만 입금이 가능합니다.");
                  }
                  
                  
//                  boolean flag = false;
////                  고객의 은행이 무슨 은행인지, 지금 선택한 은행이 무슨 은행인지
//                  if(user instanceof Shinhan) {
//                     if(i == 0) {
//                        flag = true;
//                     }
//                  }else if(user instanceof Kookmin) {
//                     if(i == 1) {
//                        flag = true;
//                     }
//                  }else {
//                     if(i == 2) {
//                        flag = true;
//                     }
//                  }
//                  if(flag) {
//                     System.out.print("입금액: ");
//                     money = sc.nextInt();
//                     if(money <= 0) {
//                        System.out.println("다시 입력해주세요.");
//                        break;
//                     }
//                     
//                     user.deposit(money);
//                  }else {
//                     System.out.println("개설한 은행에서만 입금이 가능합니다.");
//                  }
               }
               
               break;
            case 3: // 출금하기
//            	로그인
               System.out.print("계좌번호: ");
               account = sc.next();
               
               System.out.print("비밀번호: ");
               password = sc.next();
//             있는 계정인지 체크
               user = Bank.login(arrBank, arCount, account, password);
//              있는 유저라면 출금
               if(user != null) {
                  System.out.print("출금액: ");
                  money = sc.nextInt();
//                  출금하고자 하는 금액이 잔액보다 많다면 잔액 부족 처리(국민은행은 수수료 반영)
                  if(user.getMoney() < (user instanceof Kookmin ? money * 1.5 : money)) {
                     System.out.println("잔액 부족");
                     break;
                  }
                  user.withdraw(money);
               }
               break;
            case 4: // 잔액조회
//            	위와 프로세스 동일
               System.out.print("계좌번호: ");
               account = sc.next();
               
               System.out.print("비밀번호: ");
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);
               
               if(user != null) {
                  System.out.println("현재 잔액: " + user.showBalance() + "원");
               }
               
               break;
            case 5: // 계좌번호 찾기
               System.out.print("핸드폰 번호: ");
               phoneNumber = sc.next();
               user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
               
               if(user != null) {
                  System.out.print("비밀번호: ");
                  password = sc.next();
                  if(user.getPassword().equals(password)) {
                     
                     while(true) {
         //               계좌번호가 0부터 시작 가능
         //               for (int j = 0; j < ACCOUNT_LENGTH; j++) {
         //                  account += random.nextInt(10);
         //               }
                        
         //               계좌번호가 1부터 시작 가능
         //               100000 ~ 999999 -> 0 ~ 899999
//                    	 랜덤클래스 통해 계좌 재생성
                        account += random.nextInt(900000) + 100000;
//                        중복검사
                        if(Bank.checkAccount(arrBank, arCount, account) == null) {
                           break;
                        }
                     }
                     user.setAccount(account);
                     System.out.println("다시는 잃어버리지 마세요.");
                     System.out.println("너의 계좌번호: " + account);
                  }
               }
               break;
            }
         }
      }
   }
}




