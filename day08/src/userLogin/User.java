package userLogin;
//1번 : 사용자 정보를 담을 수 있는 User 클래스
public class User {
	
	// 필드
	String name;
	int age;
	String id;
	String pw;

	//생성자 (단축키 : alt + shift + s + o)
	//생성자 오버로딩
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
	// 모든 클래스의 최상위 부모 클래스 : Object 클래스
	// toString 메소드도 Object 클래스안에 포함되어있으므로 오버라이딩이 가능함
	
}
