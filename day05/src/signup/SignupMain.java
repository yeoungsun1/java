package signup;

//2번 : User 클래스의 시작(User 클래스 객체만들기)
public class SignupMain {
	public static void main(String[] args) {

		// 자료형 변수명 대입연산자 값; 자료형 변수명 = 값;
		// 클래스자료형 객체명 대입연산자 new 클래스명();
		// 클래스자료형 객체명 = new 클래스명();
		// -------- 생성자

		User user1 = new User();
		System.out.println(user1); // signup.User@279f2327
		System.out.println(user1.toString()); // signup.User@279f2327
		user1.name = "짱구";
		user1.age = 5;
		user1.id = "gu123";
		user1.pw = "gu1234";
		System.out.println(user1.name);
		System.out.println(user1.age);

		User user2 = new User();
		System.out.println(user2); // signup.User@2ff4acd0
		user2.name = "철수";
		System.out.println(user2.name);

		User user3 = new User("유리", 5, "yuri", "1234");
		System.out.println(user3);
		System.out.println(user3.name);
//				String name, int age, String id, String pw
		
		//매개변수 x, 리턴값 x 메소드 호출 => 객체명.메소드명();
		user3.printInfo();
		user2.printInfo();

	}
}
