package arrayListTask.user;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Random;

import arrayListTask.DBConnecter;

public class UserField {
   public ArrayList<User> users = DBConnecter.users;
//   로그인 상태라는 것을 나타낼 스테틱 변수
   public static String userId;
//   랜덤으로 생성하는 숫자열 길이는 항상 상수로 맨 위에 선언해놓는다
   private final int CERTIFICATED_NUMBER_LENGTH = 6;
   
//   - 아이디 중복검사
   public User checkId(String id) {
      User user = null;
      for (User temp : users) {
         if(temp.getId().equals(id)) {
//             중복 있음
            user = temp;
            break;
         }
      }
//      중복 없음
      return user;
   }
   
   
//   - 회원가입
   public void join(User user) {
//	   비밀번호 설정, 암호화
      user.setPassword(encrypt(user.getPassword()));
//    users에 회원 정보 추가
      users.add(user);
   }
   
//   - 로그인
   public boolean login(String id, String password) {
      User user = checkId(id);
      if(user != null) {
         if(user.getPassword().equals(encrypt(password))) {
            userId = user.getId();
            return true;
         }
      }
      return false;
   }
   
//   - 로그아웃
   public void logout() {
      userId = null;
   }
   
//   - 암호화
   public String encrypt(String password) {
      return new String(Base64.getEncoder().encode(password.getBytes()));
   }
   
//   - 복호화
   public String decrypt(String encryptedPassword) {
      return new String(Base64.getDecoder().decode(encryptedPassword.getBytes()));
   }
   
//   - 비밀번호 변경(마이 페이지)
   public void update(User user) {
//	   DB상 유저와 사용중인 유저가 일치하는지 확인
      User userInDB = checkId(userId);
//      일치하면 DB상 유저 정보를 변경
      users.set(users.indexOf(userInDB), user);
   }
   
//   회원 정보 조회
   public User select() {
      for(User user : users) {
         if(user.getId().equals(userId)) {
            return user;
         }
      }
      return null;
   }
   
//   - 인증번호 전송(API)
   public String sendMessage(String phoneNumber) {
//	   랜덤클래스
      Random random = new Random();
//      인증번호 받을 문자열
      String certificatedNumber = "";
//      숫자열 길이는 맨 위에서 상수로 선언
      for (int i = 0; i < CERTIFICATED_NUMBER_LENGTH; i++) {
         certificatedNumber += random.nextInt(10);
      }
//      인증번호는 문자 API에서 보낼 텍스트에 작성하면 된다.
      return certificatedNumber;
   }
}





