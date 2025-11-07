package com.koreait.userDAO;
// 1번 DBConnector 클래스 : mysql연결에 필요한 드라이버 로딩
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() {
		Connection connection = null;
		
		//mysql 연결에 필요한 부분
		String userName = "web2";
		String password = "1234";
	    String url = "jdbc:mysql://localhost:3306/webdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
//		jdbc:mysql:		=> JDBC 드라이버 종류(mysql)
//	    //localhost		=> DB 서버 주소(본인 컴퓨터-로컬서버)
//	    :3306			=> MySQL 포트번호(기본값 : 3306)
//	    /webdb			=> 접속할 데이터베이스 이름(사용자 지정)
//	    ?useSSL=false	=> SSL 연결 비활성화
//	    &allowPublicKeyRetrieval=true => MySQL 8.X의 보안 기능중 하나
//	    								(암호화 로그인 시 공개키를 클라이언트가 받아올 수 있도록 허용)
//	    &serverTimezone=UTC";	=> 서버 시간대 설정(시간 관련 오류방지-MySQL 8.0이상에서 필수)
	    
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//빨간밑줄 뜨면 마우스로 드래그해서 alt + shift + z
			connection = DriverManager.getConnection(url, userName, password);
			//빨간밑줄 뜨면 마우스 올려서 나온 것 중 두번째걸로 선택
			System.out.println("MySQL 연결 성공!");		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("JDBC 드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("MySQL 연결 실패");
			e.printStackTrace();
		}
	    
	    return connection;
	}
}
