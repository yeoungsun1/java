package input;

import java.util.Scanner;

public class InputTest04 {
	public static void main(String[] args) {
		// 이름, 나이, id, pw를 입력받고 출력하기

		// 1) 입력클래스 import
		Scanner sc = new Scanner(System.in);

		// 2) 이름 입력받기위한 출력메시지
		System.out.println("이름 입력 : ");
		// 3) 문자열 변수 선언 및 초기화(sc.nextLine())
		String name = sc.nextLine();
		// 4) 나이 입력받기 위한 출력메시지
		System.out.println("나이 입력 : ");
		// 5) 정수형 변수 선언 및 초기화(sc.nextInt())
		int age = sc.nextInt();
		// 6) 버퍼 비우기 sc.nextLine()
		sc.nextLine();
		// 7) id 입력받기 위한 출력 메시지
		System.out.println("id 입력 : ");
		// 8) 문자열 변수 선언 및 초기화(sc.nextLine())
		String id = sc.nextLine();
		// 9) pw 입력받기 위한 출력 메시지
		System.out.println("pw 입력 : ");
		// 10) 문자열 변수 선언 및 초기화(sc.nextLine())
		String pw = sc.nextLine();
		// 11) 이름, 나이, id, pw 모두 출력
		System.out.println("이름 : " + name + ", 나이 : " + age + ", id : " + id + ", pw : " + pw);

	}
}
