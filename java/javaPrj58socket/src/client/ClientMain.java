package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("--------client---------");
		
		//소켓 연결 -> localhost:12345에 연결 하겠다는 의미
		Socket socket = new Socket("192.168.40.100", 12345);
		
		//발신 전용 스트림
		InputStream inputStream = socket.getInputStream();
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		//수신 전용 스트림
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader br = new BufferedReader(inputStreamReader);
		
		while(true) {
		//데이터 발신
		System.out.print("보낼 메시지: ");
		String msg = sc.nextLine();
		ps.println(msg);
		//데이터 수신
		String rcvMsg = br.readLine();
		System.out.println("서버한테 받은 메시지:  "+ rcvMsg);
		}
		
	}
}
