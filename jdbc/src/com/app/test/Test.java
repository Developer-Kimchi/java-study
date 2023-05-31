package com.app.test;

import com.app.dao.UserDAO;
import com.app.domain.UserVO;

public class Test {
   public static void main(String[] args) {
      UserDAO userDAO = new UserDAO();
      
      UserVO userVO = new UserVO();
      
      userDAO.login("kcy1234", "5678");
      
      
   }
}

