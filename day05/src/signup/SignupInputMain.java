package signup;

import java.util.Scanner;

//3번 : User클래스의 객체에 입력한 값으로 저장하기
public class SignupInputMain {
	public static void main(String[] args) {
		// 입력 => Scanner 클래스 사용
		Scanner sc = new Scanner(System.in);
		// import 자동 완성 : ctrl + shift + o

//		//입력받기
//		System.out.println("이름입력 : ");
//		String name = sc.nextLine();
////		System.out.println(name);
//
//		System.out.println("나이입력 : ");
//		int age = sc.nextInt();
////		System.out.println(age);
//		sc.nextLine(); //버퍼 비우기
//		
//		System.out.println("아이디입력 : ");
//		String id = sc.nextLine();
//		
//		System.out.println("비밀번호 입력 : ");
//		String pw = sc.nextLine();
//		
//		//User 클래스 객체 만들기
//		//클래스명 객체명 = new 생성자();
//		User user1 = new User(name, age, id, pw); //매개변수 4개를 받는 생성자
//		
//		//필드에 저장된 값 확인 => 객체명.필드명;
//		System.out.println(user1.name);
//		System.out.println(user1.age);
//		System.out.println(user1.id);
//		System.out.println(user1.pw);
//		System.out.println(user1); //User [name=짱구, age=5, id=gu123, pw=1234]
//		
		// 객체 1개 생성 객체명 user2
		System.out.println("두번째 유저의 이름 : ");
		String name2 = sc.nextLine();
		System.out.println("두번째 유저의 나이 : ");
		int age2 = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		System.out.println("두번재 유저의 아이디 : ");
		String id2 = sc.nextLine();
		System.out.println("두번째 유저의 비밀번호 : ");
		String pw2 = sc.nextLine();
		User user2 = new User(name2, id2, pw2, age2);
		System.out.println(user2); // User [name=유리, age=5, id=ri12, pw=qwer]
		System.out.println(user2.toString());
		// .toString()는 객체를 출력하면 자동으로 .toString()이 실행된것과 동일하다

	}
}
