package com.koreait.userDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.koreait.userDTO.UserDTO;

public class UserDAO {

//	private Connection connection;
//	private PreparedStatement preparedStatement;
//	private ResultSet resultSet;

	// 회원가입(insertUser)
	public void insertUser(UserDTO user) {
		String query = "INSERT INTO TBL_USER(USER_NUMBER, USER_ID, USER_PW, USER_NAME, USER_EMAIL) "
				+ "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?)";

		try (Connection connection = DBConnector.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			preparedStatement.setString(1, user.getUserId());
			preparedStatement.setString(2, user.getUserPw());
			preparedStatement.setString(3, user.getUserName());
			preparedStatement.setString(4, user.getUserEmail());
			// 쿼리 실행
			int result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println("회원가입 성공!!");
			} else {
				System.out.println("회원가입 실패!!");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("insertUser() 메소드 SQL 오류!!");
			e.printStackTrace();
		}

//		finally { //공통 자원 정리하는 메소드 close() 호출 부분 => try~catch~finally 구문에서만 사용
//			try {
//				if (preparedStatement != null) {
//					preparedStatement.close();
//				}
//				if (connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				System.out.println("insertUser() 메소드 연결 종류 오류!!");
//				e.printStackTrace();
//			}
	} // insertUser()메소드 중괄호 끝

	// 아이디 중복검사 메소드(checkId())
	public boolean checkId(String userId) {
		String query = "SELECT 1 FROM TBL_USER WHERE USER_ID = ?";
		boolean isDuplicate = false;

		try (Connection connection = DBConnector.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query);) {
			// ?완성시키기
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				isDuplicate = true; // 중복된 아이디가 존재함
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return isDuplicate;
	} // checkId() 메소드 중괄호 끝

	// login() 메소드
	public String login(String userId, String userPw) {
		String query = "SELECT USER_NAME " + "FROM TBL_USER " + "WHERE USER_ID = ? AND USER_PW = ? ";
		String userName = null;

		try (Connection connection = DBConnector.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			ResultSet resultSet = preparedStatement.executeQuery();

			// 행이 있는지 확인하고 있으면 user_name 가져오기
			if (resultSet.next()) {
				userName = resultSet.getString("USER_NAME");
			}

			resultSet.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userName; // 로그인 성공 시 이름 반환, 실패시 null 반환
	}

}
