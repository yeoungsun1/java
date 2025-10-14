package day10;

public class PersonMain {
	public static void main(String[] args) {

		Person p = new Person();
//		System.out.println(p.name);
		// private 접근제한자가 붙은 필드의 값 확인 시 getter 이용
		System.out.println(p.getName());
		// private 접근제한자가 붙은 필드에 값 저장 시 setter 이용
		p.setName("홍길동");
		System.out.println(p.getName());

		// 매개변수 있는 생성자를 사용 시에는 setter를 사용하지 않아도 값이 저장된다
		Person p2 = new Person("짱구", 5);
		System.out.println(p2.getName());

	}
}
