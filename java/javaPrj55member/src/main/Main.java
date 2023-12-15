package main;

import member.controller.MemberManager;

public class Main {

	public static void main(String[] args) throws Exception{
		
		System.out.println("회원 관리 프록으램");
		
		MemberManager manager = new MemberManager();
		while (true) {
			try {
				manager.showMenu();				
			} catch (Exception e) {
				System.out.println("예외 발생 처음으로 돌아갑니다");
			}
		}
	}
}
