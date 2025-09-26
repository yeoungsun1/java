package controlStatement;
//6번 : 기타제어문 - break문
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) {
				break; //반복문 즉시 탈출(for문 영역을 탈출)
			}
			System.out.println(i);
		}
		System.out.println("for문 밖의 영역");
	}

}
