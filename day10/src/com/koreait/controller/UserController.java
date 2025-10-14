package com.koreait.controller;

import com.koreait.model.UserDAO;
import com.koreait.model.UserDTO;

//비즈니스 로직 처리
//view에서 전달받은 입력을 DAO에 넘기고 결과를 판단

//Model과 View 사이에서 중간다리 역할
//프로그램의 흐름을 제어함
//사용자의 요청을 처리하는 컨트롤러(사용자 요청 -> 컨트롤러 판단하고 처리방향을 정함 -> 결과 반환)
public class UserController {
	
	UserDAO userDAO = new UserDAO();
	//데이터 저장/조회 역할을 하는 UserDAO 생성
	//이 DAO를 통해 Model 계층과 연결
	
	//회원가입
	public boolean signUp(String name, int age, String userId, String userPw) {
		UserDTO userDTO = new UserDTO(name, age, userId, userPw);
		return userDAO.signUp(userDTO);
	}
	
	//로그인
	public boolean login(String userId, String userPw) {
		return userDAO.login(userId, userPw);
	}
}





