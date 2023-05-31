package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.BoardDTO;
import com.app.domain.BoardVO;

public class BoardDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	
//  �Խñ� �߰�
	public void insert(BoardVO boardVO) {
		String query = "INSERT INTO TBL_BOARD(BOARD_ID, BOARD_TITLE, BOARD_CONTENT, USER_ID) "
				+ "VALUE(SEQ_BOARD.NEXTVAL, ? ,?, ?)";
		
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, boardVO.getBoardTitle());
			preparedStatement.setString(2, boardVO.getBoardContent());
	        preparedStatement.setString(3, boardVO.getBoardRegisterDate());
	        preparedStatement.setString(4, boardVO.getBoardUpdateDate());
			preparedStatement.setLong(5, boardVO.getUserId());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert(BoardVO) SQL �Է� ����");
			e.printStackTrace();
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
				preparedStatement.close();
			}
				if(connection != null) {
				connection.close();
			}
			}catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
//  �Խñ� 1�� ��ȸ
	public BoardDTO selectBoard(Long boardId) {
		BoardDTO boardDTO = new BoardDTO();
		String query = "SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, BOARD_UPDATE_DATE, USER_ID, USER_IDENTIFICATION "
				+ "FROM TBL_USER U JOIN TBL_BOARD B ON U.USER_ID = B.USER_ID AND BOARD_ID = ?";
		
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, boardId);
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			
			boardDTO.setBoardId(resultSet.getLong(1));
			boardDTO.setBoardTitle(resultSet.getString(2));
			boardDTO.setBoardContent(resultSet.getString(3));
			boardDTO.setBoardRegisterDate(resultSet.getString(4));
			boardDTO.setBoardUpdateDate(resultSet.getString(5));
			boardDTO.setUserId(resultSet.getLong(6));
			boardDTO.setUserIdentification(resultSet.getString(7));
						
		} catch (SQLException e) {
			System.out.println("selectBoard(Long) SQL �Է� ����");
			e.printStackTrace();
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
			}
				if(preparedStatement != null) {
				preparedStatement.close();
			}
				if(connection != null) {
				connection.close();
			}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return boardDTO;
	}
//  �Խñ� ���
	public List<BoardDTO> selectAll(Long boardId){
		List<BoardDTO> boards = new ArrayList<BoardDTO>();
		BoardDTO boardDTO = null;
		String query = "SELECT SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, BOARD_UPDATE_DATE, USER_ID, USER_IDENTIFICATION "
				+ "FROM TBL_USER U JOIN TBL_BOARD B ON U.USER_ID = B.USER_ID";
		
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, boardId);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				boardDTO = new BoardDTO();
				
				boardDTO.setBoardId(resultSet.getLong(1));
				boardDTO.setBoardTitle(resultSet.getString(2));
				boardDTO.setBoardContent(resultSet.getString(3));
				boardDTO.setBoardRegisterDate(resultSet.getString(4));
				boardDTO.setBoardUpdateDate(resultSet.getString(5));
				boardDTO.setUserId(resultSet.getLong(6));
				boardDTO.setUserIdentification(resultSet.getString(7));
				
				boards.add(boardDTO);				
			}
			
		} catch (SQLException e) {
			System.out.println("selectAll(Long) SQL �Է� ����");
			e.printStackTrace();
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
			}
				if(preparedStatement != null) {
				preparedStatement.close();
			}
				if(connection != null) {
				connection.close();
			}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return boards;
	}
//  �Խñ� ����
	public void update(BoardVO boardVO) {
		String query = "UPDATE TBL_BOARD SET BOARD_TITLE = ?, BOARD_CONTENT = ?, BOARD_UPDATE_DATE = SYSDATE "
				+ "WHERE BOARD_ID = ?";
		
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, boardVO.getBoardTitle());
			preparedStatement.setString(2, boardVO.getBoardContent());
			preparedStatement.setLong(3, boardVO.getBoardId());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert(BoardVO) SQL �Է� ����");
			e.printStackTrace();
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
				preparedStatement.close();
			}
				if(connection != null) {
				connection.close();
			}
			}catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
//  �Խñ� ����
	public void delete(Long boardId) {
		String query = "DELETE FROM TBL_BOARD WHERE BOARD_ID = ?";
		
		connection = DBConnecter.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, boardId);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("delete(Long) SQL �Է� ����");
			e.printStackTrace();
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
				preparedStatement.close();
			}
				if(connection != null) {
				connection.close();
			}
			}catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}
}




















