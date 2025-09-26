package print;

public class PrintTest02 { //클래스 시작 중괄호

	public static void main(String[] args) { //메인메소드 시작 중괄호
		// TODO Auto-generated method stub

		// printf() : 서식에 맞는 값을 콘솔에 출력하고 줄바꿈이 되지 않는다
		// 자료형(DataType) 서식문자
		// 정수형 byte, short, int, long %d
		// 실수형 double, float %f
		// 논리형 boolean %s
		// 문자형 char ' '로 감싸진 1개 문자 %c
		// 문자열 String ""로 감싸진 0개 이상의 문자 %s

		System.out.printf("%d %f %s %s %c", -10, 3.14, true, "hello", 'a');
		//-10 3.140000 true hello a
		System.out.printf("%d %.2f %s %s %c", -10, 3.145, true, "hello", 'a');
		//-10 3.14 true hello a
		//소수점을 정확히 표현하고 싶을 때는 %와 f사이에 .자리수를 넣으면 된다
		//소수점이하 길이가 출력할 길이보다 값이 더 긴 경우는 반올림되서 출력된다
		System.out.println("\n안녕하세요. 저는 김영선입니다. 제 나이는 " + 20 + "살입니다.");
		System.out.printf("안녕하세요. 저는 김영선입니다. 제 나이는 %d살입니다.\n", 20);
		
		//이름, 나이, 취미 출력(println, print, printf)
		System.out.println("이름 : 김영선, 나이 : 20살, 취미 : 여행");
		System.out.print("이름 : 김영선, 나이 : 20살, 취미 : 여행\n");
		System.out.printf("이름 : %s, 나이 : %d살, 취미 : %s\n", "김영선", 20, "여행");
		
	} // 메인 메소드 종료 중괄호

} // 클래스 종료 중괄호




