package main;

import member.MemberController;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-------훼원괄리-------");
		
		MemberController memberController = new MemberController();
		//회원관리
		memberController.join();
		//로그인
		memberController.login();
	}
}
