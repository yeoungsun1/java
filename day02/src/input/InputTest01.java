package input;

import java.util.Scanner;

public class InputTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력메소드를 사용하기 위해서는 반드시 한 줄이 필요하다
		Scanner sc = new Scanner(System.in);
		//자동 import 단축키 : ctrl + shift + o
		
//		sc.next();
		System.out.println(sc.next()); //콘솔창에서 입력받고, 입력받은 값을 콘솔창에 출력한다
		System.out.println(sc.next());

		
		System.out.println(sc.nextLine()); //임시저장공간에서 엔터를 소모한다(버퍼비우기)
		System.out.println(sc.nextLine()); //김 영선
		
	}

}
