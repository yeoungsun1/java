package this01;
//1번 : this키워드
//멤버변수와 지역변수 구분 : 같은 이름의 지역변수(매개변수)와 멤버변수(필드)가 있을 때 혼동을 막기 위해 this사용
public class Person {
	//필드
	String name;
	int age;
	//생성자 alt + shift + s + o
	public Person(String name, int age) {
		super();
		this.name = name;	//this.name 멤버변수(필드) / name 매개변수
		this.age = age;
	}
	//메소드
	void printInfo() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
		System.out.println("이름 : " + name + ", 나이 : " + age); //매개변수가 없으므로 this생략가능
		//메소드 안에 매개변수나 지역변수가 없으므로 결과적으로 똑같이 필드(멤버변수)를 가리킴
		//이 메소드의 매개변수로 같은 이름이 선언되지 않았기 때문이다
	}
	void printInfo1(String name, int age) {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
		System.out.println("이름 : " + name + ", 나이 : " + age);
		//메소드 안에 지역변수(매개변수)가 name, age가 존재함
		//따라서 this.name, this.age는 필드(멤버변수)를 가리킴
		//name, age는 매개변수를 의미함
		//즉, 같은 이름으로 겹치게 되면 this를 반드시 붙여야 필드(멤버변수)임을 구분할 수 있음
	}
}
