package signup;

import java.util.ArrayList;
import java.util.Scanner;

//5번 : 로그인 기능 확인(사용자로부터 아이디와 비밀번호를 입력받아 가입한 아이디/비밀번호가 일치시 로그인 성공)
public class LoginMain {
	public static void main(String[] args) {

//		// 1명의 회원정보 저장
//		String userName = "짱구";
//		int userAge = 5;
//		String userId = "gu";
//		String userPw = "korea";

//		// 로그인
		Scanner sc = new Scanner(System.in);
//
//		System.out.println("아이디를 입력하세요 : ");
//		String inputId = sc.nextLine();
//		System.out.println("비밀번호를 입력하세요 : ");
//		String inputPw = sc.nextLine();
//
//		// 관계연산자 : a == b 같니?
////		System.out.println(1 == 1); //1과 1이 같니? 같으면 true, 틀리면 false
//		// 논리연산자 : 두 개 이상의 관계연산자를 사용해야할 때
////		System.out.println(1 == 1 || 1 > 5); 
//		// || : or 연산자 1과 1이 같거나 1이 5보다 크다에서 둘 중 하나라도 true => true
////		System.out.println(1 == 1 && 1 > 5); 
//		// && : and 연산자 1과 1이 같고 1이 5보다 크다에서 둘 다 true => true
//
//		// 문자열 비교 : 기존에저장된값문자열.equals(입력받은값문자열)
////		System.out.println(userId.equals(inputId));
////		System.out.println(userPw.equals(inputPw));
//
//		System.out.println(userId.equals(inputId) && userPw.equals(inputPw));
//		if (userId.equals(inputId) && userPw.equals(inputPw)) {
//			System.out.println("로그인 성공!!");
//			System.out.println(userName + "님 환영합니다!");
//		} else {
//			System.out.println("로그인 실패!!");
//			System.out.println("아이디나 비밀번호를 확인하세요.");
//		}

		// User 클래스를 이용한 로그인
		User user1 = new User("짱구", 5, "gu", "korea");
		User user2 = new User("철수", 5, "su", "1234");
		System.out.println(user1);
		System.out.println(user2);
		ArrayList<User> users = new ArrayList<>();
		System.out.println(users);
		users.add(user1);
		System.out.println(users);
		users.add(user2);
		System.out.println(users);

		// for-each문
		for (User u : users) {
			System.out.println(u);
		}

		System.out.println("아이디 입력 : ");
		String inputId = sc.nextLine();
		System.out.println("비밀번호 입력 : ");
		String inputPw = sc.nextLine();
		System.out.println(user1.id.equals(inputId) && user1.pw.equals(inputPw));
		if (user1.id.equals(inputId) && user1.pw.equals(inputPw)) {
			System.out.println("로그인 성공!!");
			System.out.println(user1.name + "님 환영합니다!");
		} else {
			System.out.println("로그인 실패!!");
			System.out.println("아이디나 비밀번호를 확인하세요.");
		}

	}
}
