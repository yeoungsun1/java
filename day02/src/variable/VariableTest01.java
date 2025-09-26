package variable;

public class VariableTest01 { //클래스 시작 중괄호 영역

	public static void main(String[] args) { //main메소드 시작 중괄호영역
		// TODO Auto-generated method stub
		//변수 선언과 사용
		//자료형 변수명;
		//변수명 = 값;
		
		//정수형 int, long
		int year;	//변수 선언, 정수형 변수 year를 선언했다.
		year = 2025; //2025라는 정수형 값을 year라는 변수에 대입했다(저장했다)
		
		System.out.println("올해는 " + year + "년도 입니다.");
		//올해는 + year라는 변수에 저장된 값 2025 + 년도 입니다
		//올해는 2025년도입니다라는 문자열 값을 콘솔창에 출력한다
		
		//변수 선언과 초기화
		//자료형 변수명 =(대입연산자) 값;
		int age = 20; //20이라는 정수형 값을 age라는 정수형 변수에 대입했다
		long population = 8000000000L;
		System.out.println("나이 : " + age);
		System.out.println("세계 인구 : " + population);
//		int popluation2 = 8000000000; int 타입이 담을 수 있는 값의 범위를 벗어나므로 에러발생
//		int : 4byte(32bit) => 약 -21억 ~ +21억 -2,147,483,648 ~ 2,147,483,647
//		long : 8byte(64bit) : 약 +-9경
		int number = 2147483647;

	} //main메소드 중괄호영역 끝

} //클래스 중괄호영역 끝
