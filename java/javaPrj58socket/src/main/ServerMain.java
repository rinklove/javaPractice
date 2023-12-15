package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws Exception{
		System.out.println("-------Server--------");
		
		Scanner sc = new Scanner(System.in);
		
		//서버 소켓 생성(연결 받을 수 있음)
		ServerSocket serverSocket = new ServerSocket(12345);
		//연결 대기하기
		System.out.println("연결 대기중 processing...");
		Socket socket = serverSocket.accept();
		//연결된 ip주소 가져오는 메소드
		InetAddress inetAddress = socket.getInetAddress();
		System.out.println(inetAddress+" 연결됨~!~!");
		//수신 전용 스트림
		InputStreamReader inReader = new InputStreamReader(socket.getInputStream());
		OutputStream out = socket.getOutputStream();
		
		//발신 전용 스트림
		PrintStream ps = new PrintStream(out);
		
		BufferedReader br = new BufferedReader(inReader);
		while(true) {
			//데이터 읽기
			String str = br.readLine();
			System.out.println("클라이언뚜가 보낸 메시지: "+ str);		
			//데이터 보내기
			System.out.print("보낼 메시지: ");
			String msg = sc.nextLine();
			ps.println(msg);			
		}


	}
}
