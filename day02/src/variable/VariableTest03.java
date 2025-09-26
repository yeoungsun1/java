package variable;

public class VariableTest03 {
	public static void main(String[] args) {
		//이름과 나이를 저장할 변수 선언 후 값 대입
		String name;	//문자열 저장공간의 이름을 name 선언
		name = "홍길동"; //name 변수에 "홍길동"이라는 문자열 값을 대입(저장)
		System.out.println(name); //name에 저장된 문자열 값을 콘솔에 출력하고 줄바꿈된다
		
		int age;	//정수형 저장공간의 이름을 age로 선언
//		System.out.println(age); //값을 대입하지 않고 출력하면 오류 발생, 반드시 초기화가 되어야한다
		age = 20; //age변수에 20이라는 정수형 값을 대입(저장)
		System.out.println(age);
		
		String id = "korea"; //문자열 저장공간의 이름을 id로 선언, korea 문자열로 초기화
		int pw = 1234; //정수형 저장공간의 이름을 pw로 선언, 1234 정수형값으로 초기화
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(name + "님 환영합니다!");
		
	}
}
