package methodLogin;

import java.util.Scanner;

// 8번 : 로그인, 회원가입, 메인 메소드(반복문) 기능 구현(3일차~4일차)
public class LoginApp { // 클래스 중괄호 시작 영역

	// 단 한명의 사용자만 저장하기 위한 필드 선언
	private static String saveId = null; // 회원가입시 입력한 아이디 저장
	private static String savePw = null; // 회원가입시 입력한 비밀번호 저장
	// null : 값이 없음을 나타내는 키워드, 아직 회원가입이 안 된 상태를 의미

	// 회원가입 메소드(매개변수 o, 리턴값 o)정의
	boolean joinUs(String id, String pw) {
		saveId = id;
		savePw = pw;
		return true; // true 회원가입 성공을 의미
	}

	// 로그인 메소드(매개변수 o, 리턴값 o) 정의
	boolean login(String id, String pw) {
		if (saveId == null) {
			return false; // 아직 회원가입이 안됨
		}

		return saveId.equals(id) && savePw.equals(pw);
	}
	// 문자열 비교는 .equals()를 이용해야한다
	// && (논리 AND 연산자) : 조건문에서 두가지 이상 조건을 동시에 검사할 때 사용
	// 양쪽 조건이 모두 true일 때만 전체가 true가 된다

	public static void main(String[] args) { // 메인메소드 중괄호 시작 영역

		Scanner sc = new Scanner(System.in);
		// 입력 클래스를 통해 콘솔입력을 받을 준비
		LoginApp app = new LoginApp();

		String inputId;
		String inputPw;
//		System.out.println(inputId); 초기화가 되지 않았기 때문에 출력은 불가능
		while (true) { // while문 중괄호 시작 영역
			System.out.println("1. 회원가입\n" + "2. 로그인\n" + "3. 종료\n" + "번호를 선택하세요 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 버퍼비우기

			switch (choice) { // switch문 중괄호 시작 영역
			case 1:
				System.out.println("===========1번을 선택했습니다. 회원가입 진행합니다. ===========");
				System.out.println("아이디 입력 : ");
				inputId = sc.nextLine();
				System.out.println("비밀번호 입력 : ");
				inputPw = sc.nextLine();

				if (app.joinUs(inputId, inputPw)) { // if~else문 중괄호 시작 영역
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				} // if~else문 중괄호 끝 영역
				break;
			case 2:
				System.out.println("===========2번을 선택했습니다. 로그인을 진행합니다. ===========");
				System.out.println("아이디 입력 : ");
				inputId = sc.nextLine();
				System.out.println("비밀번호 입력 : ");
				inputPw = sc.nextLine();

				if (app.login(inputId, inputPw)) {
					System.out.println("로그인 성공!!");
				} else {
					System.out.println("로그인 실패!! 아이디 또는 비밀번호를 확인하세요.");
				}
				break;
			case 3:
				System.out.println("===========3번을 선택했습니다. 프로그램을 종료합니다. ===========");
				sc.close(); // 입력 메소드를 다 사용한 후 입력 클래스 닫기
				return; // main 종료
			default:
				System.out.println("잘못된 번호입니다. 확인후 입력해주세요.");
				break;

			} // switch문 중괄호 끝 영역

		} // while문 중괄호 끝 영역

	} // 메인메소드 중괄호 끝 영역

} // 클래스 중괄호 끝 영역
