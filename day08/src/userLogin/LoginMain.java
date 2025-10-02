package userLogin;

import java.util.ArrayList;
import java.util.Scanner;

//4번 : 로그인 검증 메소드
public class LoginMain {
	public static void main(String[] args) { //main 메소드 영역 시작
		
		Scanner sc = new Scanner(System.in);
		LoginMain l = new LoginMain();
		
		//회원목록 생성
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("짱구", 5, "gu", "1234"));
		users.add(new User("철수", 10, "su", "qwer"));
		users.add(new User("유리", 6, "yuri", "qwer1234"));
		users.add(new User("맹구", 5, "mang", "pass"));
		users.add(new User("훈이", 6, "hun", "1234"));
		System.out.println(users);
		
		//로그인 성공 여부 변수
		boolean loginSuccess = false;
		
		//반복문(for문)
		for(int i = 1; i <= 5; i++) {
			System.out.println("\n[" + i + "번째 시도]");
			
			//입력받기
			System.out.println("아이디 입력 : ");
			String inputId = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String inputPw = sc.nextLine();
			
			//매개변수 o, 리턴값 o 메소드 호출 => syso(객체명.메소드명(인수1, 인수2, 인수3));
			//	=> 자료형 변수명 = 객체명.메소드명(인수1, 인수2, 인수3);
			int result = l.checkLogin(users, inputId, inputPw);
			System.out.println(result); //-1, 0, 1
			
			if(result == 1) {
				loginSuccess = true;
				break;
			}else if(result == 0) {
				System.out.println("비밀번호가 틀렸습니다");
			}else {
				System.out.println("존재하지 않는 아이디입니다");
			}
		} //for문 영역 끝
		
		if(!loginSuccess) {
			System.out.println("\n5번 로그인 시도 실패하여 로그인이 종료됩니다.");
		}
		
		
	} //main메소드 영역 중괄호 끝
	
	//로그인 검증 메소드(매개변수o, 리턴값o 메소드 정의)
	//리턴값 : 1(성공), 0(비밀번호 틀림), -1(아이디 없음)
	int checkLogin(ArrayList<User> users, String inputId, String inputPw) {
		for(User u : users) { //for-each문 영역(중괄호) 시작
			if(u.id.equals(inputId)) { //아이디 일치 시 조건문 영역 시작
				if(u.pw.equals(inputPw)) { //비밀번호 일치 시 조건문 영역 시작
					System.out.println("로그인 성공!" + u.name + "님 환영합니다!");
					return 1; //로그인 성공
				} //비밀번호 조건문 영역 끝
				return 0; //비밀번호 틀림
			} //아이디 조건문 영역 끝
		} // for-each문 영역 끝
		return -1; //아이디 없음
	} // checkLogin 메소드 영역 끝
} //LoginMain 클래스 영역 끝
