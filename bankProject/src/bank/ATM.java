package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
      String[] bankNames = {"��������", "��������", "īī����ũ"};
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[3];
      final int ACCOUNT_LENGTH = 6;
      
      String message = "1. ��������\n2. ��������\n3. īī����ũ\n4. ������";
      String menu = "1. ���°���\n2. �Ա��ϱ�\n3. ����ϱ�\n4. �ܾ���ȸ\n5. ���¹�ȣ ã��\n6. ���� ���� �޴��� ���ư���";
      Scanner sc = new Scanner(System.in);
//      ���¹�ȣ ���� ���� ���� Ŭ����
      Random random = new Random();
      String account = "", password = null, phoneNumber = null;
      Bank user = null;
      int money = 0;
      int i = 0, choice = 0;
      
      
      while(true) { 
         System.out.println(message);
         i = sc.nextInt();
         
         if(i == 4) {break;}
//         �Ʒ����� banks �ε������� �����ؾ� �ϹǷ� i - 1
         i--;
         
         while(true) {
//        	 account ���ڿ��� �ʱ�ȭ �����ش�
            account = "";
            Bank[] banks = {new Shinhan(), new Kookmin(), new Kakao()};
            
            System.out.println(menu);
            choice = sc.nextInt();
            
            if(choice == 6) {break;}
            
            switch(choice) {
            case 1: // ���°���
               if(arCount[i] == 100) {System.out.println("�� �̻� ���¸� ������ �� ���� �����Դϴ�."); break;}
               
               user = banks[i];
               

               
//               while�� �ȿ��� random ���¹�ȣ ���� �� �ߺ��˻�
//               ���� ���� �� �𸣹Ƿ� while�� ���
               while(true) {
   //               ���¹�ȣ�� 0���� ���� ����
   //               for (int j = 0; j < ACCOUNT_LENGTH; j++) {
   //                  account += random.nextInt(10);
   //               }
                  
   //               ���¹�ȣ�� 1���� ���� ����
   //               100000 ~ 999999 -> 0 ~ 899999
                  account += random.nextInt(900000) + 100000;
//                  ���ึ�� �Ǿ� ������ȣ �ְ� ���� ��
                  account = i + 1 + account;
                  
//                  �ߺ��˻� ���� �̹� �ִ� account���� Ȯ���ϰ� ������ while�� Ż��
                  if(Bank.checkAccount(arrBank, arCount, account) == null) {
                     break;
                  }
               }
               
//               ���¹�ȣ ���� �Ϸ�
               user.setAccount(account);
//               �����ָ� ���� �Է��Ͽ� ����
               System.out.print("������: ");
               user.setName(sc.next());
               
               while(true) {
                  System.out.print("��й�ȣ[4�ڸ�]: ");
                  password = sc.next();
                  
//                  �н����� ���̰� 4���� ���� while�� Ż��
                  if(password.length() == 4) {break;}
               }
//               �н����� ����
               user.setPassword(password);
               
               while(true) {
                  System.out.print("�ڵ��� ��ȣ['-' ����]");
                  phoneNumber = sc.next();
//                 �Է��� ���� - ���� ��� �ش� ���ڴ� �ƿ� ���� ������ replace �Ѵ�
                  phoneNumber = phoneNumber.replaceAll("-", "");
//                  �޴��� ��ȣ�� 11�ڸ��̰� ������ ���� ��ȣ�� ��쿡�� while�� Ż��
                  if(phoneNumber.length() == 11 && Bank.checkPhoneNumber(arrBank, arCount, phoneNumber) == null) {break;}
               }
               
//               ��ȭ��ȣ ����
               user.setPhoneNumber(phoneNumber);
               
//               ������ ���¹�ȣ, �����ָ�, �н�����, ��ȭ��ȣ�� ����������� user�� ���� DB�� �����Ѵ�.
               arrBank[i][arCount[i]] = user;
//               �� �� ����
               arCount[i]++;
               
               System.out.println(bankNames[i] + ", ȯ���Ѵ�.");
               System.out.println("���� ���¹�ȣ: "+ account);
               
               break;
            case 2: // �Ա��ϱ�
               System.out.print("���¹�ȣ: ");
               account = sc.next();
               
               System.out.print("��й�ȣ: ");
               password = sc.next();
               
               // ����ҿ� ����, �Է¹��� ���¹�ȣ�� ��й�ȣ�� �����ϸ�
               // �α��� �˻縦 ���� �α��� ���� �� ȸ�� ��ü�� �������ش�.
               user = Bank.login(arrBank, arCount, account, password);
//               user�� null�� �ƴ϶��, �� �����ϴ� user���
               if(user != null) {
//            	   ���ڿ� �ε��� 0�� �ִ� ����(���� ���� ��ȣ) ������ ������ ���� ��ġ�ϴٸ�
                  if(user.getAccount().charAt(0) - 48 == i + 1) {
                     System.out.print("�Աݾ�: ");
                     money = sc.nextInt();
//                     �Աݾ� -�� ��� �ٽ� �Է�
                     if(money <= 0) {
                        System.out.println("�ٽ� �Է����ּ���.");
                        break;
                     }
                     user.deposit(money);
                  }else {
                     System.out.println("������ ���࿡���� �Ա��� �����մϴ�.");
                  }
                  
                  
//                  boolean flag = false;
////                  ���� ������ ���� ��������, ���� ������ ������ ���� ��������
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
//                     System.out.print("�Աݾ�: ");
//                     money = sc.nextInt();
//                     if(money <= 0) {
//                        System.out.println("�ٽ� �Է����ּ���.");
//                        break;
//                     }
//                     
//                     user.deposit(money);
//                  }else {
//                     System.out.println("������ ���࿡���� �Ա��� �����մϴ�.");
//                  }
               }
               
               break;
            case 3: // ����ϱ�
//            	�α���
               System.out.print("���¹�ȣ: ");
               account = sc.next();
               
               System.out.print("��й�ȣ: ");
               password = sc.next();
//             �ִ� �������� üũ
               user = Bank.login(arrBank, arCount, account, password);
//              �ִ� ������� ���
               if(user != null) {
                  System.out.print("��ݾ�: ");
                  money = sc.nextInt();
//                  ����ϰ��� �ϴ� �ݾ��� �ܾ׺��� ���ٸ� �ܾ� ���� ó��(���������� ������ �ݿ�)
                  if(user.getMoney() < (user instanceof Kookmin ? money * 1.5 : money)) {
                     System.out.println("�ܾ� ����");
                     break;
                  }
                  user.withdraw(money);
               }
               break;
            case 4: // �ܾ���ȸ
//            	���� ���μ��� ����
               System.out.print("���¹�ȣ: ");
               account = sc.next();
               
               System.out.print("��й�ȣ: ");
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);
               
               if(user != null) {
                  System.out.println("���� �ܾ�: " + user.showBalance() + "��");
               }
               
               break;
            case 5: // ���¹�ȣ ã��
               System.out.print("�ڵ��� ��ȣ: ");
               phoneNumber = sc.next();
               user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
               
               if(user != null) {
                  System.out.print("��й�ȣ: ");
                  password = sc.next();
                  if(user.getPassword().equals(password)) {
                     
                     while(true) {
         //               ���¹�ȣ�� 0���� ���� ����
         //               for (int j = 0; j < ACCOUNT_LENGTH; j++) {
         //                  account += random.nextInt(10);
         //               }
                        
         //               ���¹�ȣ�� 1���� ���� ����
         //               100000 ~ 999999 -> 0 ~ 899999
//                    	 ����Ŭ���� ���� ���� �����
                        account += random.nextInt(900000) + 100000;
//                        �ߺ��˻�
                        if(Bank.checkAccount(arrBank, arCount, account) == null) {
                           break;
                        }
                     }
                     user.setAccount(account);
                     System.out.println("�ٽô� �Ҿ������ ������.");
                     System.out.println("���� ���¹�ȣ: " + account);
                  }
               }
               break;
            }
         }
      }
   }
}




