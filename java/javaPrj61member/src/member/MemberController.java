package member;

import java.io.File;
import java.util.Scanner;

public class MemberController {

	private Scanner sc;
	private MemberDao dao;
	private File f;
	
	public MemberController() {
		sc = new Scanner(System.in);
		dao = new MemberDao();
	}
	//회원가입
	public void join() {
		
		//데이터 입력받기
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("아이디: ");
		String pwd = sc.nextLine();
		System.out.print("아이디: ");
		String nickname = sc.nextLine();
		//데이터 뭉치기
		MemberData member = new MemberData(id, pwd, nickname);
		//할일, 저장공간에 저장
		boolean result;
		try {
			result = dao.join(member);
		} catch (Exception e) {
			result = false;
		}
		//결과 출력
		if(result) System.out.println("회원가입 성공");
		else System.out.println("회원가입 실패");
	}
	
	//로그인
	public void login() {
		//데이터 입력받기
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("아이디: ");
		String pwd = sc.nextLine();
		//데이터 뭉치기
		MemberData member = new MemberData(id, pwd);
		//할일, 저장공간에서 꺼낸 데이터랑 비교
		boolean result;
		try {
			result = dao.login(member);
		} catch (Exception e) {
			result = false;
		}
		//결과 출력
		if(result) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
	}
}
