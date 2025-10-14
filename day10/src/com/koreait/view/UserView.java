package com.koreait.view;

import java.util.Scanner;

//사용자와 직접 상호작용하는 역할(View)
//콘솔 메뉴 출력, 사용자 입력, 결과메시지 출력
public class UserView {
	private Scanner sc = new Scanner(System.in);

	// 메뉴를 콘솔에 출력하는 메소드
	// Main에서 호출하여 사용자한테 선택지를 보여줌
	public void showMenu() {
		System.out.println("\n========사용자 시스템========");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		System.out.println("선택 : ");
	}

	// 사용자로부터 아이디 입력 받는 메소드(회원가입/로그인 시 사용)
	public String inputUserId() {
		System.out.println("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		return id;
	}

	// 사용자로부터 비밀번호 입력 받는 메소드(회원가입/로그인 시 사용)
	public String inputUserPw() {
		System.out.println("비밀번호를 입력하세요 : ");
//		String pw = sc.nextLine();
		return sc.nextLine();
	}

	// 이름을 입력하는 메소드(회원가입 시 사용)
	public String inputUserName() {
		System.out.println("이름을 입력하세요 : ");
		return sc.nextLine();
	}

	// 나이를 입력하는 메소드(회원가입 시 사용)
	public int inputUserAge() {
		System.out.println("나이를 입력하세요 : ");
		return sc.nextInt();
	}

	// 처리 결과를 콘솔에 출력하는 메소드
	// Controller에서 받은 결과를 사용자에게 보여주는 용도
	public void showResult(String msg) {
		System.out.println(msg);
	}

	// 사용자가 값을 입력하는 메소드(메뉴에서 숫자 입력)
	public int menuChoice() {
		int choice = -1;

		//예외처리문법 (try ~ catch문 : 프로그램이 비정상적으로 종료되는 것을 막고 
		//정상적으로 종료될 수 있도록 하기 위함)
		//예외가 발생할 수 있는 부분이 여러줄일 경우 드래그하고 alt + shift + z => try~catch 선택
		try {
			choice = sc.nextInt();
			sc.nextLine(); // 버퍼비우기
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("1, 2, 3 중 하나만 입력 가능합니다");
		}
		return choice;

	}

}
