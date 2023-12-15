package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberManager {
	
	Scanner sc  = new Scanner(System.in);
	Map<String, Member> map = new HashMap();
	
	public void startWork() {
		while(true) {
			showMenu();
			String input = sc.nextLine();
			switch(input) {
			case "1": login(); break;
			case "2": join(); break;
			case "3": return;
			default: System.out.println("잘못고름");
			}			
		}
	}

	public void showMenu() {
		System.out.println("----------------------");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 종료");
		System.out.println("----------------------");
	}
	
	public String scanUserString() {
		return sc.nextLine();
	}
	
	public void join() {
		System.out.println("회원가입");
		System.out.print("아이디: ");
		String id  =scanUserString();
		
		System.out.print("비밀번호: ");
		String pwd  =scanUserString();
		
		System.out.print("닉네임: ");
		String nickname  =scanUserString();
		
		Member newMember = new Member(id,pwd,nickname);
		map.put(newMember.getId(), newMember);
		System.out.println("회원가입 완료");
		System.out.println(newMember.getNickname()+"릠 어서 로그인을 하세용용");	
		
//		boolean isValidate = checkValidation(newMember);
		
//		if(isValidate) {
//			System.out.println("이미 있는 아이디입니다~~");
//		}else {
//			
//		}
	}
	
	public void login() {
		System.out.println("-로그인-^^7");
		System.out.print("아이디를 입력하세요");
		String id = scanUserString();		
		System.out.print("비밀번호를 입력하세요");
		String pwd = scanUserString();
		Member findMember = map.get(id);			
			
		if(id.equals(findMember.getId()) && pwd.equals(findMember.getPwd())) {
			System.out.println("로그인 성공공"+ findMember.getNickname()+"님어서오세용");
		}
	}
	private void checkValidation(Member m) throws Exception{
			checkId(m.getId());
	}
	
	private void checkId(String id) {
		if(id.length() < 4) 
			throw new IllegalArgumentException("아이디가 너무 짧아요");
		else if(map.containsKey(id)) 
			throw new IllegalArgumentException("이미 존재하는 회원이에요");
	}
	
	private void checkPwd(String pwd) {
		if(pwd.length() < 4) 
			throw new IllegalArgumentException("비밀 번호가 너모 짧아요");
	}


}
