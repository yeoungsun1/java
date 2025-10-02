package userLogin;

import java.util.ArrayList;
import java.util.Scanner;

//3번 : 로그인 시도 제한(3번)
public class LoginRetryMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<User> users = new ArrayList<>();
		
		users.add(new User("민수", 25, "minsu25", "pass123"));
//		System.out.println(users);
		users.add(new User("지은", 22, "jieun22", "pass"));
//		System.out.println(users);
		users.add(new User("태현", 29, "taehyun", "abc11"));
		users.add(new User("영선", 20, "sun", "korea"));
		System.out.println(users);
		System.out.println(users.size());
		
		boolean isLogin = false;
//		System.out.println(isLogin);
//		System.out.println(!isLogin);
		
		//3번 로그인 시도
		for(int i = 1; i <= 3; i++) {
			System.out.println("\n[" + i + "번째 로그인 시도]");
			
			//입력 받기
			System.out.println("아이디 입력 : ");
			String inputId = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String inputPw = sc.nextLine();
			
			//for-each문 : 입력한 아이디, 비밀번호와 저장되어있는 아이디, 비밀번호가 같은지 파악
			for(User u : users) {
				if(u.id.equals(inputId) && u.pw.equals(inputPw)) {
					System.out.println("로그인 성공!!" + u.name + "님 환영합니다!!");
					isLogin = true;
					break;
				}
			}
			
			if(isLogin) {
				break;
			}else {
				System.out.println("아이디 또는 비밀번호를 확인하세요");
			}
			
		}//for문 종료 영역
		if(!isLogin) {
			System.out.println("\n로그인시도 3번실패하여 로그인이 종료됩니다.");
		}
	}
}










