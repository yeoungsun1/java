package controlStatement;
//7번 : 기타제어문 - continue문
public class ContinueTest {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
