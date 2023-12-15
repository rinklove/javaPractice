package main;



import member.MemberController;

public class Main {

	public static void main(String[] args) {
		
		MemberController memberController = new MemberController();
		try {
			memberController.join();
			memberController.login();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
