package com.koreait.userDTO;
//1번 : UserDTO 테이블을 생성 후 컬럼값과 JAVA의 클래스 안에 필드값을 매핑
public class UserDTO {
//	CREATE TABLE TBL_USER(
//			USER_NUMBER NUMBER,		-- 숫자(정수)
//			USER_ID VARCHAR2(30),	-- 문자열
//			USER_PW VARCHAR2(30),	-- 문자열
//			USER_NAME VARCHAR2(30), -- 문자열
//			USER_AGE NUMBER,		-- 숫자(정수)
//			USER_GENDER CHAR(1) DEFAULT 'M', -- 문자형 -> 문자열
//			CONSTRAINT PK_USER PRIMARY KEY(USER_NUMBER)
//		);
	
	// 테이블 컬럼은 _ 스네이크 표기법으로 작성됨
	// 자바에서 사용 시에는 카멜표기법으로 변경해서 작성해야함
	
	//필드
	//그리드 모드 alt + shift + a
	private int userNumber;
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userGender;
	
	//게터, 세터 만들기 alt + shift + s + r
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	//Object 클래스에 있는 toString() 메소드 오버라이딩(재정의)
	//alt + shift + s + s
	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPw=" + userPw + ", userName="
				+ userName + ", userAge=" + userAge + ", userGender=" + userGender + "]";
	}
	
}









