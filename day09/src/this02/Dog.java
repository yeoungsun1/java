package this02;
//2번 : this 키워드
//현재 객체 자신을 가리킬 때 : 메소드 안에서 this는 메소드를 호출한 객체 자기자신을 의미함
public class Dog {
	//this : 현재 객체 자기자신
	//메소드를 실행하는 주체(즉, 어떤 객체가 호출했는지)를 가리킴
	//같은 클래스에서 여러 객체가 만들어져도 this는 각각의 객체 자신을 참조함
	
	//필드
	String name;	
	//생성자
	public Dog() {
		super();
		System.out.println(this);
	}
	
	public Dog(String name) {
		super();
		this.name = name;
	}
	
	//메소드
	void bark() {
		System.out.println(this.name + "이(가) 멍멍!!!");
	}
	void playWith(String name) {
		System.out.println(this.name + "이가 " + name + "이와 같이 놉니다");
	}
	void playWith(Dog dog) {
		System.out.println(this.name + "이가 " + dog + "와 같이 놉니다");
	}
	
}
