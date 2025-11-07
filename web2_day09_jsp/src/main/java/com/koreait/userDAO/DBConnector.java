package com.koreait.userDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() {
		// getConnection() static 메소드를 만든다 => static 메소드는 클래스명.메소드명으로 호출해서 사용가능하다

		Connection connection = null;
		// 연결에 필요한 정보
		String userName = "web2";
		String password = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// URL 정해져있는것, JDBC로 연결할 때 URL주소 / 어디로 전달할건지를 작성 => URL을 정확하게 작성해야한다!
		// JDBC 연결은 구글링하면 나온다

		// 드래그 후 alt + shift + z => try~catch문 단축키
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 이 부분이 문제가 없으면 메모리에 올라간다, 관리할 수 있게 된 것을 의미함
			// 커넥션 객체가 드라이버로 오게된다

			connection = DriverManager.getConnection(url, userName, password); // 빨간밑줄 나온 부분드래그 두번째것 클릭
			System.out.println("연결성공");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 정보 오류");
			e.printStackTrace();
		}

		return connection;

	}
}
