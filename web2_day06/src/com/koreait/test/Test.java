package com.koreait.test;

//4번 : DBConnector 클래스 완성후 연결테스트,
//		UserDAO 클래스의 메소드 호출하는 클래스
import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

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
/* ----------------------------------day07 수업 이어서 진행----------------------------------------- */
//		//단일 로그인 메소드 호출
//		//입력클래스 import-입력메소드 사용가능
//		Scanner sc = new Scanner(System.in);
//		//입력받기 위한 출력 메시지1
//		System.out.println("아이디를 입력하세요 : ");
//		String userId = sc.nextLine();
//		//입력받기 위한 출력 메시지2
//		System.out.println("비밀번호를 입력하세요 : ");
//		String userPw = sc.nextLine();
//		//로그인 시도
//		String name = userDAO.login(userId, userPw);
//		
//		if(name != null) {
//			System.out.println("로그인 성공!! " + name +"님, 환영합니다!");
//		}else {
//			System.out.println("로그인 실패!! 아이디 또는 비밀번호를 확인하세요!");
//		}
		
//		//로그인 메소드 호출 - 3번까지 로그인 시도
//		//while문의 조건식에서 비교 대상이 될 변수
//		int count = 0;
//		//상수(항상 같은 값) 
//		//상수명 작성 시 대문자로 쓰고 _로 연결해서 선언, final 키워드를 작성해야한다
//		final int MAX_ATTEMPT = 3; //상수선언 3이라는 값으로 고정
//		//상태를 확인해줄 플래그 변수
//		boolean isLogin = false;
//		
//		//while문을 통한 반복문
//		while(count < MAX_ATTEMPT) {
//			//로그인 메소드 호출
//			//입력클래스 import-입력메소드 사용가능
//			Scanner sc = new Scanner(System.in);
//			//입력받기 위한 출력 메시지1
//			System.out.println("아이디를 입력하세요 : ");
//			String userId = sc.nextLine();
//			//입력받기 위한 출력 메시지2
//			System.out.println("비밀번호를 입력하세요 : ");
//			String userPw = sc.nextLine();
//			//로그인 시도
//			String name = userDAO.login(userId, userPw);
//			
//			if(name != null) {
//				System.out.println("로그인 성공!! " + name +"님, 환영합니다!");
//				isLogin = true; //로그인 성공했기 때문에 더이상 로그인 시도를 하지 않도록 true로 변경
//				break; //로그인 성공 시 반복문(while) 종료
//			}else {
//				//증감연산자, count 변수에 1씩 더함
//				count++;
//				System.out.println("로그인 실패!! 아이디 또는 비밀번호를 확인하세요!"
//						+ "(" + count + "/" + MAX_ATTEMPT + ")");
//			}
//		} //while문 중괄호 끝 영역
//		
//		if(!isLogin) {
//			System.out.println("로그인 3회 실패! 프로그램을 종료합니다");
//		}
		
//		//비밀번호 변경 메소드 호출
//		Scanner sc = new Scanner(System.in);
//		
//		//입력받기 위한 메시지 출력1
//		System.out.println("비밀번호를 변경할 아이디 입력 : ");
//		String userId = sc.nextLine();
//		
//		//입력받기 위한 메시지 출력2
//		System.out.println("기존 비밀번호 입력 : ");
//		String userPw = sc.nextLine();
//		
//		//입력받기 위한 메시지 출력3
//		System.out.println("새로운 비밀번호 입력 : ");
//		String newPw = sc.nextLine();
//		
//		boolean chPw = userDAO.changePw(userId, userPw, newPw);
//		if(chPw) {
//			System.out.println("비밀번호가 성공적으로 변경되었습니다");
//		}else {
//			System.out.println("비밀번호 변경을 실패했습니다. 기존 아이디 또는 비밀번호를 먼저 확인해주세요.");
//		}
		
		//회원탈퇴 메소드 호출
		boolean deleteResult = userDAO.deleteUser(6);
		if(deleteResult) {
			System.out.println("회원탈퇴 되었습니다.");
		}else {
			System.out.println("회원탈퇴가 실패했습니다.");
		}
		
	}
}




















