package methodTest;
//1번 : 메소드 호출방법
public class MethodTest { //클래스 영역 시작 중괄호
	public static void main(String[] args) { //메인메소드 영역 시작 중괄호
		//메소드 호출시 사용방법 2가지
		//- 메소드 정의하는 부분에서 선언부 제일 앞쪽에 static 키워드를 붙인다
		//(메모리 영역이 다르고 사용하는 경우가 따로 존재하기 때문에 무조건 사용하면 안된다)
		
		//- 메인 메소드에 해당 메소드가 정의되어 있는 클래스를 알려준다
		//클래스명 객체명 = new 클래스명();
		MethodTest mt = new MethodTest();
		
		//1) 매개변수x, 리턴값x 메소드 호출
		mt.printHello();
		
		//2) 매개변수o, 리턴값x 메소드 호출
		mt.greet("김영선");
		mt.greet("짱구");

		//3) 매개변수x, 리턴값o 메소드 호출
		System.out.println(mt.sumTen());
		
		//4) 매개변수o, 리턴값o 메소드 호출
		System.out.println(mt.sum(0));
		int result1 = mt.sum(100);
		System.out.println("1부터 100까지의 합 : " + result1);
		int result2 = mt.sum(3);
		System.out.println("1부터 3까지의 합 : " + result2);
	} //메인메소드 영역 종료 중괄호
	
	//1) 매개변수x, 리턴값x 메소드 정의
	//보통 단순히 실행만 하는 경우 사용
	void printHello() {
		System.out.println("안녕하세요, 만나서 반갑습니다.");
	}
	
	//2) 매개변수o, 리턴값x 메소드 정의
	//입력은 받지만 결과값을 돌려주지않고 출력만 하는 경우 사용
	//이름 + 님 환영합니다!를 출력하는 메소드
	void greet(String name) {
		System.out.println(name + "님 환영합니다!");
	}
	
	//3) 매개변수x, 리턴값o 메소드 정의
	//1부터 10까지의 합을 반환하는 메소드
	//(1) 기능 생각 => 1부터 10까지의 합을 구한다
	//(2) 반환타입 생각나지 않으면 => void로 작성
//	void
	//(3) 메소드명 작성 => 동사형 sumTen
//	void sumTen(){}
	//(4) 매개변수 생각 => 고정된 1~10 합이므로 지금은 필요없음
//	void sumTen(){}
	//(5) 기능 실행 문장 작성 => 1부터 10까지 합을 구하는 로직 넣기
// 	void sumTen(){
//		총합구할변수 선언 int total = 0;
//		반복문(범위가 지정되어있으므로 for문 사용) for(초기식 int i = 1; 조건식 i < 11; 증감식 i++){
//			total 변수에 i를 누적해서 덧셈 total += i; //total = total + i;
//	}
	//(6) 리턴값 생각 => return total; 리턴타입을 int로 수정
	
	int sumTen() {
		int total = 0;
		for(int i = 1; i < 11; i++) {
			total += i;
		}
		return total;
	}
	
	//4) 매개변수o, 리턴값o 메소드 정의
	//1부터 n까지의 합을 반환하는 메소드
	//(1) 기능을 생각한다 => 1부터 n까지 합 구하기
	//(2) 반환타입이 생각나지않는다면 우선 => void
//	void
	//(3) 기능에 알맞은 메소드명을 작성한다 => 동사형, sum
//	void sum() {}
	//(4) 매개변수를 생각한다 => n까지의 합을 구해야하므로 정수형 매개변수가 1개 필요함
//	void sum(int n) {}
	//(5) 기능을 실행할 문장을 작성 => for문 1부터 n까지 더하기
//	void sum(int n){
//		총합구할변수 선언
//		for(초기식 int i = 1; 조건식 i <= n; 증감식 i++){
//			총합구할변수 += i;
//		}
//	}
	//(6) 리턴값을 생각한다 => 계산된 합을 반환해야하므로 return 합 반환타입을 수정 void -> int
//	int sum(int n){
//		총합구할변수 선언
//		for(초기식 int i = 1; 조건식 i <= n; 증감식 i++){
//			총합구할변수 += i;
//		}
//		return 총합구할변수;
//	}	
	
	int sum(int n) {
		int total = 0; //총합을 저장할 변수 선언
		for(int i = 1; i <= n; i++) {
			total += i; //1부터 n까지 더하기
		}
		return total; //최종 합 반환
	}
	
	
} //클래스 영역 종료 중괄호











