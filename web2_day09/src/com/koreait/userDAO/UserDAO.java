package com.koreait.userDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.koreait.userDTO.UserDTO;

public class UserDAO {
	// DB 연결 객체
	public Connection connection;
	// SQL 구문을 미리 컴파일하여 실행하는 객체
	public PreparedStatement preparedStatement;
	// SELECT문 실행 후 결과 테이블을 담는 객체
	public ResultSet resultSet;
	// 자동 import 단축키 : ctrl + shift + o

	// 1. 전체 회원 조회 메소드
	public List<UserDTO> selectAll() {
		// 여러 회원 정보를 담을 리스트 객체
		List<UserDTO> userList = new ArrayList<>();

		// 문자열 타입 쿼리문
		// 실행할 SQL문 (회원 전체 조회, 회원번호 기준 오름차순 정렬)
		String query = "SELECT * FROM TBL_USER ORDER BY USER_NUMBER";

		try {
			// (1) DB 연결 객체 가져오기
			connection = DBConnector.getConnection();
			// (2) SQL 구문을 준비(쿼리문 미리 컴파일)
			preparedStatement = connection.prepareStatement(query);
			// (3) SQL 실행 후 결과(ResultSet) 반환
			resultSet = preparedStatement.executeQuery();
			// executeQuery() : select 실행시 사용, 결과는 ResultSet으로 반환
			// executeUpdate() : insert, update, delete 실행 시 사용, 결과는 영향받은 행의 수로 반환(int)

			// (4) 결과 집합(ResultSet)에서 행(Row)단위로 데이터 꺼내오기
			while (resultSet.next()) {
				// 한 행의 데이터를 UserDTO 객체 담기
				UserDTO user = new UserDTO();
				// 컬럼명과 매칭하여 값 세팅
				user.setUserNumber(resultSet.getInt("USER_NUMBER"));
				user.setUserId(resultSet.getString("USER_ID"));
				user.setUserPw(resultSet.getString("USER_PW"));
				user.setUserName(resultSet.getString("USER_NAME"));
				user.setUserAge(resultSet.getInt("USER_AGE"));
				user.setUserGender(resultSet.getString("USER_GENDER"));
				// 리스트에 UserDTO 객체 추가
				userList.add(user);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("selectAll() 메소드 SQL문 오류발생");
			e.printStackTrace();
		} finally {
			// 사용한 자원 해제(connection, preparedStatement, resultSet 순의 역순으로 해제)
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				// 자원 해제 중 오류 발생 시 처리
				System.out.println("연결 해제시 오류발생!");
				e.printStackTrace();
			}
		}
		// 최종적으로 회원 리스트 반환
		return userList;

	} // 메소드 중괄호 끝 영역

	// 2. 회원가입 메소드
	public void insertUser(UserDTO userDTO) {
		// 1) 실행할 SQL문 쿼리 작성
		// USER_NUMBER 컬럼의 값 : mysql에서는 자동 증가값 사용을 auto_increment로 한다
		// USER_ID, USER_PW, USER_NAME, USER_AGE, USER_GENDER는 ?로 처리(나중에 바인딩)
		String query = "INSERT INTO TBL_USER(USER_ID, USER_PW, USER_NAME, USER_AGE, USER_GENDER) "
				+ "VALUES(?, ?, ?, ?, ?)";

		try {
			// 연결 성공 => 오라클로 쿼리문을 보낼 수 있다 => 쿼리 실행이 가능해진다
			// 2) DB연결 객체 생성
			// DBConnector 클래의 getConnection() 메소드로 오라클 DB와 연결
			connection = DBConnector.getConnection();
			// 3) SQL 실행 준비
			// PreparedStatement는 ?로 된 부분을 나중에 값으로 바인딩할 수 있다
			preparedStatement = connection.prepareStatement(query);
			// 쿼리문이 미완성된 상태이므로 ?로 된 부분을 채워준다
			// 4) ? 바인딩(1번부터 순서대로 매핑)
			// userDTO 객체에서 값을 꺼내서 각각의 ?에 설정
			preparedStatement.setString(1, userDTO.getUserId()); // USER_ID
			preparedStatement.setString(2, userDTO.getUserPw()); // USER_PW
			preparedStatement.setString(3, userDTO.getUserName()); // USER_NAME
			preparedStatement.setInt(4, userDTO.getUserAge()); // USER_AGE
			preparedStatement.setString(5, userDTO.getUserGender()); // USER_GENDER
			// 쿼리문이 완성된 상태가 된다 => ?로 된 부분이 모두 채워진다
			// INSERT 쿼리문 실행(executeUpdate() 메소드 사용)
			// 5) SQL 실행
			// 실행결과는 적용된 행(row) 수가 반환됨
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// 예외처리 SQL 실행과정에서 오류가 발생하면 catch문으로 들어옴
			// TODO Auto-generated catch block
			System.out.println("insertUser() 회원가입 메소드 SQL 오류!!");
			e.printStackTrace();
		} finally {
			// 6) 자원정리(DB 연결 종료)
			// - 반드시 close() 호출해서 자원 누수 방지
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// 종료 과정에서 발생한 예외처리
				// TODO Auto-generated catch block
				System.out.println("insertUser() 메소드 연결 종료 오류!!");
				e.printStackTrace();
			}
		}
	} // insertUser() 회원가입 메소드 중괄호 영역 끝

	// 3. 아이디 중복확인 메소드
	public boolean checkId(String userId) {
		// 1) 실행할 sql 쿼리 작성
		// USER_ID가 특정값과 일치하는 행의 USER_NUMBER 조회
		// 해당 아이디가 존재하는지 여부만 확인하는 용도
		String query = "SELECT USER_NUMBER FROM TBL_USER WHERE USER_ID = ?";

		try {
			// 2) DB 연결 객체 생성
			connection = DBConnector.getConnection();
			// 3) SQL 실행 준비
			preparedStatement = connection.prepareStatement(query);
			// 4) ? 바인딩
			// userId를 첫번째 ?에 세팅
			preparedStatement.setString(1, userId);
			// 5) SQL 실행
			resultSet = preparedStatement.executeQuery();
			// 6) 결과처리
			// resultSet.next()는 행이 존재하면 true반환
			// 동일한 USER_ID가 이미 존재하면 true => 중복 아이디(이미 존재하는 아이디)
			if (resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// SQL 실행 과정에서 오류발생 시 예외처리
			System.out.println("checkId() ID 중복확인 메소드 sql 오류!!");
			e.printStackTrace();
		} finally {
			// 7) 자원 정리(resultSet, preparedStatement, connection 종료)
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("checkId() 연결 종료 오류!");
				e.printStackTrace();
			}
		}
		// 8) 기본 반환값
		// 조회된 결과가 없으면 false 반환 => 중복 아님(사용가능한 아이디)
		return false;
	} // checkId() 메소드 중괄호 끝 영역
	/* ----------------------------------day07 수업 이어서 진행----------------------------------------- */
	//4. 로그인 메소드
	public String login(String userId, String userPw) {
		//1) 실행할 SQL 쿼리 작성
		//입력받은 ID와 PW가 일치하는 사용자의 USER_NAME을 조회
		String query = "SELECT USER_NAME FROM TBL_USER WHERE USER_ID = ? AND USER_PW = ?";
		
		//2) 로그인 성공 시 반환할 사용자 이름을 담을 변수 선언
		String name = null;
		
		try {
			//3) DB 연결 객체 생성
			connection = DBConnector.getConnection();
			
			//4) SQL 실행 준비(쿼리문 미리 컴파일)
			preparedStatement = connection.prepareStatement(query);
			
			//5) ? 바인딩(순서대로 userId, userPw)
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, userPw);
			
			//6) SQL문 실행(SELECT문이므로 executeQuery() 사용 - 담아줄 변수 ResultSet 타입의 객체로 만든다)
			resultSet = preparedStatement.executeQuery();
			
//			//7) 결과 처리
//			//resultSet.next()가 true라면 로그인 정보가 일치하는 사용자 존재 => 로그인 성공
//			//false라면 로그인 정보가 일치하는 사용자 미존재 => 로그인 실패
			if(resultSet.next()) {
//				//USER_NAME 컬럼값을 name변수에 저장
				name = resultSet.getString("USER_NAME");
//				System.out.println("로그인 성공!! " + name + "님 환영합니다!");
			}
//			else {
//				System.out.println("로그인 실패! 아이디 또는 비밀번호가 일치하지 않습니다");
//			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//8) SQL 실행 중 오류 발생시 예외처리
			System.out.println("login() 로그인 메소드 SQL 오류!!");
			e.printStackTrace();
		} finally {
			//9) 사용한 자원 해제(연결 종료)
			//resultSet -> preparedStatement -> connection 순서로 진행
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
				// TODO Auto-generated catch block
				System.out.println("login() 연결 종료 오류!!");
				e.printStackTrace();
			}
			
		}
		
		//10) 최종적으로 name 반환
		//로그인 성공시 사용자 이름, 실패시 null 반환
		return name;
		
	} //login 메소드 중괄호 끝 영역
	
	//5. 비밀번호 변경 메소드
	public boolean changePw(String userId, String userPw, String newPw) {
		//1) 업데이트 쿼리문 작성(DML)
		String query = "UPDATE tbl_user SET USER_PW = ? WHERE USER_ID = ? AND USER_PW = ?";
		try {
			//2) DB 연결 객체 가져오기
			connection = DBConnector.getConnection();
			//3) SQL 구문 준비
			preparedStatement = connection.prepareStatement(query);
			//4) 물음표 완성 코드 작성(? 바인딩)
			preparedStatement.setString(1, newPw);
			preparedStatement.setString(2, userId);
			preparedStatement.setString(3, userPw);
			//5) 정수형 변수 결과 저장(몇 행이 영향을 받았는지가 나옴-executeUpdate())
			int result = preparedStatement.executeUpdate();
			//6) 반환값 
			return result > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//7) SQLException 발생시 출력 메시지
			System.out.println("changePw() 메소드 SQL 오류!!");
			e.printStackTrace();
		} finally {
			//8) 연결 해제
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("changePw() 연결 종료 오류!!");
				e.printStackTrace();
			}
		}
		return false;
	} // changePw() 메소드 중괄호 끝 영역
	
	//6. 회원탈퇴 메소드
	public boolean deleteUser(int userNumber) {
		//1) 실행할 SQL문 쿼리 작성
		String query = "DELETE FROM TBL_USER WHERE USER_NUMBER = ?";
		
		try {
			//2) DB 연결객체 생성
			connection = DBConnector.getConnection();
			
			//3) SQL 실행 준비
			preparedStatement = connection.prepareStatement(query);
			
			//4) ? 바인딩
			//USER_NUMBER의 값을 채워야하므로 매개변수로 받은 userNumber를 첫번째 ?에 세팅
			preparedStatement.setInt(1, userNumber);
			
			//5) SQL 실행
			int result = preparedStatement.executeUpdate();
			System.out.println("=====삭제된 행 수 : " + result + "======");
			//6) result > 0 true라면 성공적으로 데이터가 삭제(회원탈퇴 완료)
			return result > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("deleteUser() SQL 오류!!");
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return false;
	} // deleteUser 메소드 중괄호 끝 영역
	
}// 클래스 중괄호 끝 영역
