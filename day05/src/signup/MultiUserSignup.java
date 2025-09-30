package signup;

import java.util.ArrayList;
import java.util.Scanner;

//4번 : 여러명의 사용자를 입력받아 저장(리스트, 반복문-for문 사용)
public class MultiUserSignup {
	public static void main(String[] args) {
		//입력클래스 import
		Scanner sc = new Scanner(System.in); 
		//ArrayList 리스트 : 여러명의 User 객체(회원)를 저장할 리스트
		ArrayList<User> users = new ArrayList<>();
		
		System.out.println("3명이 회원가입을 진행합니다!");
		
		//반복문 for(초기식; 조건식; 증감식){}
		for(int i = 0; i < 3; i++) {
			//i++ => i = i + 1
			
			System.out.println("\n[" + (i+1) + "번째 회원]");
			//몇번째 회원정보를 입력하는지 확인하기 위한 출력 메소드
			
			System.out.println("이름 입력 : ");
			String name = sc.nextLine();
			System.out.println("나이 입력 : ");
			int age = sc.nextInt();
			sc.nextLine(); //버퍼 비우기
			System.out.println("아이디 입력 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 입력 : ");
			String pw = sc.nextLine();
			
			User user1 = new User(name, age, id, pw);
			//user1 객체의 필드(이름, 나이, 아이디, 비밀번호)를 입력받은 값으로 저장
//			users.add(1); 타입을 제한하기 위해 위에 ArrayList<User>로 사용함
			users.add(user1); //users에는 타입이 지정되어있으므로 User클래스의 객체만 들어갈 수 있음
			//users 리스트에 입력받은 이름, 나이, 아이디, 비밀번호로 객체를 생성한 user1을 추가
			
		} //for문 중괄호 영역 끝
		
		System.out.println(users.size()); //users 리스트 길이
		System.out.println(users);
//		[User [name=a, age=5, id=a, pw=1234], 
//		 User [name=b, age=10, id=b, pw=1234], 
//		 User [name=c, age=20, id=test, pw=1234]]
		
		System.out.println("\n가입된 회원 목록 확인");
		for(int i = 0; i < users.size(); i++) {
			//users.size() : 리스트의 총길이만큼을 저장하고 있는 메소드 => 3
			User user = users.get(i);
			System.out.println("▶" + user.name + ", " + user.id);
			System.out.println(user);
			System.out.println(user.toString());
			user.printInfo();
		}
		
	}
}








