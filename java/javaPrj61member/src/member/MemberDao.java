package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MemberDao {

	private File f;
	
	public MemberDao() {
		String s = File.separator;
		String path = "D:\\java\\dev\\member.txt";
		f = new File(path);
	}
	//회원 가입 //파라미터로 전달받은 데이터 저장공간에 넣기
	public boolean join(MemberData member) throws Exception {
		
		//할일
		FileWriter fw = new FileWriter(f);
				
		String str = member.getId() +"/"+ member.getNickname() +"/"+member.getNickname();
		fw.write(str);
		fw.close();
		//결과 리턴
		return true;
	}
	
	//로그인 //파라미터로 전달받은 데이터랑 저장공간의 데이터랑 비교
	public boolean login(MemberData member) throws Exception {
		//할일
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String memoStr = br.readLine();
		String[] memoData = memoStr.split("/");
		
		return memoData[0].equals(member.getId()) && memoData[1].equals(member.getPwd());
	}
}
