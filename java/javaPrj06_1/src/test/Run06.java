package test;

import java.util.Scanner;

public class Run06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		switch(month) {
			case 2: System.out.println("28"); break;
			case 4: System.out.println("30"); break;
			case 12: System.out.println("31"); break;
			default: System.out.println("29"); break;
		}
	}

}
