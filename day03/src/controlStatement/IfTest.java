package controlStatement;
//2번 : 조건문-if문
public class IfTest {
	public static void main(String[] args) {
		//if문
		//if(조건식){ }
		//if(조건식){
		//		조건식이 참이면 실행할 문장
		//}else{
		//		조건식이 거짓이면 실행할 문장
		//}
		//관계연산자 : >, <, >=, <=, ==, !=
		//점수가 60점 이상이면 합격출력, 60미만이면 불합격
		
		int score = 30;
		System.out.println("현재 점수는 " + score + "점 입니다.");
		System.out.println(score >= 60);
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
}






