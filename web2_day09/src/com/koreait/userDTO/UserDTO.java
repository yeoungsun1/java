package com.koreait.userDTO;
// 2번 : mysql에서 만든 테이블 컬럼을 보고 자바클래스의 필드 선언
public class UserDTO {
	//MySQL에서 만든 TBL_USER 테이블
//	create table TBL_USER(
//			user_number int auto_increment primary key, 
//			user_id varchar(30), -- 
//			user_pw varchar(30), -- 
//			user_name varchar(30),
//			user_age int, -- 
//			user_gender char(1) default 'M'
//		);
	
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
