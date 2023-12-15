package member;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MemberController {

	private Scanner sc;
	
	
	public MemberController() {
		sc = new Scanner(System.in);
	}

	/**
	 * 회원가입
	 * @throws FileNotFoundException 
	 */
	public void join() throws FileNotFoundException {
		System.out.println("홰원가잎");
		//사용자 아이디 받기
		System.out.print("아이디: ");
		String id = sc.nextLine();
		//비밀번호
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		//닉네임
		System.out.print("닉네임: ");
		String nickname = sc.nextLine();		
		//저장
		 boolean result = new MemberDao().join(new MemberData(id,pwd,nickname));
		if(result) System.out.println("회원 가입 성공띠~!~!~!~!~!~!");
		else System.out.println("회원가입 실패ㅇωㅇ");
	}
	
	/**
	 * 회원가입
	 */
	public void login() {
		//아이디, 비밀번호 입력 받기
		System.out.println("회원과잎같은 로그인");
	
		System.out.print("아이디: ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호: ");
		String pwd = sc.nextLine();
		//저장된 데이터 꺼내기
		MemberData findMember = new MemberData (id, pwd);
		boolean isMember =  new MemberDao().login(findMember);
		//비교 
		if(isMember) System.out.println("로그인 성공");
		else System.out.println("로그인 실패 ㅇωㅇ");
		//결과 출력
	}
	
}
