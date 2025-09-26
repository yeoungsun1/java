package input;

import java.util.Scanner;

public class InputTest03 {
	public static void main(String[] args) {
		// nextInt() : 입력받은 값을 int 타입으로 돌려준다

		// nextDouble() : 입력받은 값을 double 타입으로 돌려준다

		Scanner sc = new Scanner(System.in); // 입력메소드를 사용하기 위해 입력클래스를 이용해야한다
		System.out.println("나이 입력하세요 : "); // 출력메소드 - 소괄호안에있는 값을 콘솔창에 출력하고 줄바꿈된다
//		System.out.println(sc.nextInt());

		// 정수형 변수 = 값(sc.nextInt());
		int age = sc.nextInt(); // nextInt() 입력메소드를 통해 입력받은 정수형 값을 age라는 정수형변수에 저장
		System.out.println("나이 : " + age); // 출력메소드 - 소괄호안에 있는 값을 콘솔창에 출력하고 줄바꿈된다
		// age라는 변수에 저장된 입력한 정수 값을 출력한다

		System.out.print("오늘 날짜를 0.00형태로 입력하세요 : "); // 출력메소드 - 소괄호안에있는 값을 콘솔창에 출력하고
		// 줄바꿈되지 않는다
		// 실수형 date = sc.nextDouble()
		double date = sc.nextDouble(); // 입력받은 실수형 값을 실수형 date 변수에 저장
		sc.nextLine(); // 버퍼비우기(엔터소모하기)
		System.out.println("오늘 날짜 : " + date); // date에 저장된 값을 콘솔창에 출력하고 줄바꿈된다

		System.out.print("이름을 입력하세요 : "); // 출력메소드 - 소괄호안에있는 값을 콘솔창에 출력하고 줄바꿈되지 않는다
		String name = sc.nextLine(); // 문자열값을 입력받고 name 변수에 저장
		System.out.println("이름 : " + name); // name에 저장된 값을 콘솔창에 출력하고 줄바꿈된다
	}
}
