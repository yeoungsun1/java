package com.koreait.test;

//4번 : DBConnector 클래스 완성후 연결테스트,
//		UserDAO 클래스의 메소드 호출하는 클래스
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.koreait.userDAO.DBConnector;
import com.koreait.userDAO.UserDAO;
import com.koreait.userDTO.UserDTO;

public class Test {
	public static void main(String[] args) {

		// 연결테스트
//		Connection connection = DBConnector.getConnection();
//		
//		//.close 메소드 사용시 예외처리 필수 : try~catch블록 사용 alt + shift + z
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// 전체회원 조회 메소드 호출
		Connection connection = DBConnector.getConnection();
		// 1) UserDAO 객체 생성(UserDAO 안에 있는 메소드를 사용하기 위함)
		UserDAO userDAO = new UserDAO();
		// 2) 전체 회원 조회 메소드 호출
		List<UserDTO> userList = userDAO.selectAll();
		// 3) 결과 출력
		System.out.println("---userList 출력결과---\n" + userList);

		// 반복문을 통해 한 명씩 꺼내서 출력
		System.out.println("\n---테이블의 한 행씩 조회---");
		for (UserDTO user : userList) {
			System.out.println(user);
		}

//		//회원가입 위한 DTO 객체 생성 및 값 설정
//		UserDTO newUser = new UserDTO();
//		newUser.setUserId("test");
//		newUser.setUserPw("test1");
//		newUser.setUserName("신짱구");
//		newUser.setUserAge(5);
//		newUser.setUserGender("M");
//		
//		//회원가입 메소드 호출
//		userDAO.insertUser(newUser);
//		System.out.println("회원가입 성공");

		// id중복확인 메소드 호출
		boolean idCheck = userDAO.checkId("korea1");
		if (idCheck) {
			System.out.println("id는 이미 존재합니다. 다른 아이디를 입력하세요.");
		} else {
			System.out.println("사용가능한 아이디 입니다");
		}

	}
}
