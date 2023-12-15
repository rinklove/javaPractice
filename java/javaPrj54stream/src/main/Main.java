package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.Socket;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws Exception{
		System.out.println("스트림");
		
		File file = new File("D:\\java\\dev\\hello.txt");
//		file.delete(); //파일 삭제 메소드
		
		//파일에 작성 - OutputStream 객체는 1바이트씩 처리
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write(LocalDate.now().toString().getBytes());
		
		//파일에 작성 - Writer객체는 2바이트씩 처리 write() -> flush() 작업 필요
 		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(LocalDate.now().toString()+"\n");
		fileWriter.write(LocalDate.now().toString()+"\n");
		fileWriter.write(LocalDate.now().toString()+"\n");
		fileWriter.flush();
		
		PrintStream pm = new PrintStream(file);
		pm.println("didididid");
		
//		FileInputStream inputStream = new FileInputStream(file);
//		
//		//맨 앞의 한 글자를 가지고와서 출력
//		int read=0;
//		while(read != -1) {
//			read = inputStream.read();
//			char ch = (char) read;
//			System.out.println(ch); //100
//		}
//		-------------------------------------------------------
		
		//한줄씩 읽어오기
		BufferedReader bf = new BufferedReader(new FileReader(file));
		System.out.println(bf.readLine());
		System.out.println(bf.readLine());		
		
	}
}
