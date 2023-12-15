package member.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class MemberManager {

	private Scanner sc;
	private File f;
	private PrintWriter pw;
	private BufferedReader bf;
	
	public MemberManager() throws Exception {
		sc = new Scanner(System.in);
		String x = File.separator;
		f =new File("D:"+x+"java"+x+"dev"+x+"data.txt");
		pw = new PrintWriter(new FileWriter(f, true), true); //autoflush 허용
//		bf = new BufferedReader(new FileReader(f));
	}
	
	//메뉴
	public void showMenu() throws Exception{
		System.out.println("----선택----");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 전체 회원 조회");
		
		switch(sc.nextLine()) {
		case "1": join(); break;
		case "2": login(); break;
		case "3": selectAll(); break;
		default: System.out.println("다시 입력하세요"); break;
		}
	}
	
	// 회원가입
	private void join() {
		System.out.println("----------훼원가입----------");
		//유저 한테 입력 받기
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		System.out.print("닉네임: ");
		String nickname = sc.nextLine();
		//메모장에 저장
		
		pw.println(id+"/"+pwd+"/"+nickname);
		System.out.println("홰언가입 왈료");
	}
	
	// 록으인
	private void login() throws Exception {
		bf = new BufferedReader(new FileReader(f));
		System.out.println("----------로그인----------");
		//유저한테 입력 받기
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		// 파일에서 회원 정보 조히한 뒤 일치하는 지 확인
		boolean isUser =false;
		String[] findUser= {};
		while(true) {
			String str = bf.readLine();
			if(str ==null) break;
			findUser = str.split("/");
			isUser = id.equals(findUser[0]) && pwd.equals(findUser[1]);			
		}
		if(isUser) {
			System.out.println("로그인왈료");			
			System.out.println(findUser[2]+"님 환영합니다ㅇωㅇ");
		} else {
			System.out.println("로그인실패ㅇωㅇ");						
		}
	}
	
	//모든 정보 조홰
	public void selectAll() throws Exception {
		bf = new BufferedReader(new FileReader(f));
		//파일에서 모든 정보 읽기
		while(true) {
			String str = bf.readLine();
			if(str==null) break;
			System.out.println(str);
		}
		
	}
}
