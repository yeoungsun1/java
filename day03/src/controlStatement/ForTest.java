package controlStatement;
//4번 : 반복문-for문
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(초기식; 조건식; 증감식){ 반복실행할 문장 }
		for(int i = 1; i < 6; i++) { // for문 중괄호 시작 영역
			System.out.println(i + "번째 반복");
		} //for문 중괄호 영역 종료 
		System.out.println("for문 실행 끝");
	}
	//누적연산자 : i++ => i의 값에 +1 누적해서 i에 대입
	//복합대입연산자 : i += 1 	(i = i + 1)

}
