package member;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private File f;
	
	public MemberDao() {
		String s = File.separator;
		String fileName = "D:"+s+"java"+s+"dev"+s+"member.txt";
		f = new File(fileName);
	}
	
	public boolean join(MemberData member)  {
		FileOutputStream out = null;
		PrintStream ps = null;
		try {
			out = new FileOutputStream(f, true);
			ps = new PrintStream(out, true);
			
			String data = member.getId() +"/"+ Base64.getEncoder().encodeToString(member.getPwd().getBytes()) +"/"+member.getNickname();
			ps.println(data);
		} catch (Exception e) {
			System.out.println("에러발생생");
			return false; //리턴이 있어도 finally 블록은 실행 후 반환
		} finally {
			ps.close();
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
	
	public boolean login(MemberData member) {
		BufferedReader br = null;
		FileReader fr = null;
		boolean isSuccess = false;
		//읽어오는 스트림
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);

			String dataLine = br.readLine();
			System.out.println("str: "+dataLine);

			String[] memberData = dataLine.split("/");
			System.out.println(Base64.getDecoder().decode(memberData[1]).toString());
			if (member.getId().equals(memberData[0])
					&& member.getPwd().equals(Base64.getDecoder().decode(memberData[1]).toString())) {
				isSuccess = true;
				member.setNickname(memberData[2]);
			}
				

		} catch (Exception e) {
			System.out.println("파일이 없대용용");
			return false;
		} finally {
			try {
				if(fr != null && fr.ready() == true) fr.close();
			} catch (IOException e) {return false;}
			
			try {
				if(br != null && br.ready() == true) br.close();
			} catch (IOException e) {return false;}
		}
		
		
		//파일 공간에서 데이터 꺼내기
		
		//
		return isSuccess;
	}
}
