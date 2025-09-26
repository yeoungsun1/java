package controlStatement;
//5번 : 반복문-while문, do~while문
public class WhileTest {
	public static void main(String[] args) {
		
		int i = 1;
//		while(조건식) { 조건식이 참일동안 반복실행 }
//		while(i < 6) { //while 시작 중괄호 영역
//			System.out.println(i + "번째반복");
//			i++; //i + 1
//			
//		}//while문 영역 중괄호 종료
//		System.out.println("while문 실행 끝");
		
		do {
			System.out.println(i + "번째 반복");
			i++;
		}while(i < 0); 
		//do ~ while문은 while문의 조건식이 거짓이라도 무조건 do 중괄호 안의영역
		//코드를 한번은 실행한다
		
	}
}
