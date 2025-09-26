package controlStatement;
//3번 : 조건문-switch문
public class SwitchTest {

	public static void main(String[] args) {
		
		String season = "가을";
		
		switch(season) {
		case "봄":
			System.out.println("지금 계절은 봄입니다.");
			break;
		case "여름":
			System.out.println("지금 계절은 여름입니다.");
			break;
		case "가을":
			System.out.println("지금 계절은 가을입니다.");
			break;
		case "겨울":
			System.out.println("지금 계절은 겨울입니다.");
			break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
		
	}
}








