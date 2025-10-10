package this03;
//3번 : this()
//this() : 같은 클래스안의 생성자에서 다른 생성자를 호출
//반드시 생성자의 첫 줄에만 올 수 있음
//코드 중복을 줄이고 하나의 생성자에서 공통 초기화를 맡기기 위해 사용함
//올바른 this() 체이닝 구조 : 가장 마지막 생성자(모든 필드를 초기화하는 생성자)가 공통 초기화 담당이 되고
// 다른 생성자들은 모두 this(...)를 통해 최종 생성자를 호출하는 방식이 가장 깔끔한 방식
public class Student {
	//필드
	String name;
	int grade;
	String school;
	//생성자1 : 이름만 받는 매개변수1개
	public Student(String name) {
		this(name, 1, "코리아 고등학교"); 	// 기본 학년은 1학년, 학교는 코리아 고등학교
//		this.name = name;
	}
	//생성자2 : 이름과 학년 받는 매개변수 2개
	public Student(String name, int grade) {
		this(name, grade, "코리아 고등학교"); 	// 기본 학교는 코리아 고등학교
//		this(name);
//		this.grade = grade;
	}
	//생성자3 : 이름, 학년, 학교 모두 받는 매개변수 3개
	public Student(String name, int grade, String school) {
		super();
		this.name = name;
		this.grade = grade;
		this.school = school;
	}
	//메소드
	void printInfo() {
		System.out.println("이름 : " + this.name + ", 학년 : " + this.grade + ", 학교 : " + this.school);
	}
	
	
}
