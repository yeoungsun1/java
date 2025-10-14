package day10;
//getter, setter 확인
public class Person {
	//필드
	private String name;
	private int age;
	
	//기본 생성자
	public Person() {
		super();
	}
	//매개변수가 있는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0) { //유효성 검사 가능
			this.age = age;
		}
	}
	
	
}
