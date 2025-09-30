package signup;

//1번 : 사용자의 정보를 저장할 틀 만들기(User클래스)
public class User {
	// User 클래스는 하나의 회원정보를 저장하는 틀(설계도)

	// 필드(특징) : 이름, 나이, 아이디, 비밀번호
	String name; // 문자열 자료형 이름 저장할 필드
	public int age; // 정수형 자료형 나이 저장할 필드
	String id; // 문자열 자료형 아이디 저장할 필드
	String pw; // 문자열 자료형 비밀번호 저장할 필드

	// 생성자 : User 클래스의 객체가 만들어질 때 자동으로 실행된다
	// 생성자는 개발자가 만들지 않으면 컴파일러가 자동으로 기본 생성자를 만들어준다

	// 기본생성자
	public User() {
		super();
	}

	// 매개변수가 4개의 필드에 값을 저장하는 생성자
	public User(String name, int age, String id, String pw) {
		super(); // 상속관계(extends) 부모의 생성자
		// 상속받는 클래스가 없을 때는 Object 클래스의 생성자를 가리킨다
		// Object 클래스는 모든 클래스의 최상위 부모 클래스

		// this : 객체 자기자신(클래스로 객체를 만들면 필드에 값을 저장할 수 있다)
		// 객체 구별용 변수
		this.name = name; // 객체마다 교유한 값을 저장하기 위해 사용
		this.age = age;
		this.id = id;
		this.pw = pw;
	}

	public User(String name, String id, String pw, int age) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
	}

	// 메소드, 생성자 오버로딩 => 다형성
	// 오버로딩 : 값은 이름으로 매개변수의 타입, 순서, 개수가 다르면 선언할 수 있다

	// 메소드 : 하나의 기능(행동, 행위, 동작)
	// 000님 환영합니다 출력하는 메소드
	// 접근제한자 반환타입 메소드명(){}
	public void printInfo() {
		System.out.println(this.name + "님 환영합니다!");
		System.out.println(this.id + "로 회원가입 되었습니다!");
	}

	// toString 단축키 : alt + shift + s + s
	// 객체의 주소값 대신에 필드에 저장된 값으로 확인할 때 사용한다
	// @Override 오버라이딩 : 다형성 특징 중 하나
	// 상속관계, 부모클래스에 있는 메소드를 내용만 수정해서 사용하도록 하는 것을 의미한다
	// Object 클래스도 가능(모든 클래스의 최상위 부모 클래스기 때문에)
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}

}
