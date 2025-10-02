package userLogin;
//1번 : 사용자 정보를 담을 수 있는 User 클래스
public class User {
	
	// 필드
	String name;
	int age;
	String id;
	String pw;

	//생성자 (단축키 : alt + shift + s + o)
	//기본생성자
	public User() {
		super();
	}

	//매개변수가 4개인 생성자
	public User(String name, int age, String id, String pw) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
	}
	
	//메소드(회원정보 출력 메소드)
	void printInfo() {
		System.out.println("===========[회원정보]===========");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + this.age);
		System.out.println("아이디 : " + this.id);
		System.out.println("==============================");
	}

	//toString 메소드 오버라이딩 : alt + shift + s + s
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}
	
}
