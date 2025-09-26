package inputTest;

import java.util.Scanner;

//1번 : 입력 메소드 연습
public class InputTest {

	public static void main(String[] args) {
		//사용자로부터 이름과 나이를 입력받아서 값 출력하기
		
		//1) 입력클래스 import
		Scanner sc = new Scanner(System.in);
		//자동 import 단축키 : ctrl + shift + o
		
		//2) 이름입력 메시지 출력
		System.out.println("이름 입력 : ");
		//3) 문자열 변수 선언, 입력메소드(next(), nextLine())
		String name = sc.nextLine();
		//4) 나이입력 메시지 출력
		System.out.println("나이 입력 : ");
		//5) 정수형 변수 선언, 입력메소드(nextInt())
		int age = sc.nextInt();
		
		sc.nextLine(); //버퍼비우기(엔터 소모하기)
		//6) 출력
		System.out.println("입력한 이름은 " + name + "이고,"
				+ " 나이는 " + age + "살입니다.");
		
		//7) id와 pw를 한칸 띄어쓰기로 입력하세요 메시지 출력
		System.out.println("id와 pw를 한 칸 띄어쓰기로 입력하세요 : ");
		//8) id와 pw를 저장할 변수 선언, 입력메소드(next())
		String id = sc.next();
		String pw = sc.next();
		//9) id, pw 출력
		System.out.println("id는 " + id + ", pw는 " + pw + "입니다.");
		
	}

}
