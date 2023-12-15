package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제어문 복습 => if / else if / else / switch / default / break / continue
		//반복문 복습 => for / while / do -while / continue / break 
		//for + continue => 이후의 코드를 실행하지 않고 바로 증감식으로 이동
		// while + continue => 이후의 코드를 실행하지 않고 바로 조건식으로 이동
//		--------------------------------------------------
//		제어문 복습
		//사용자로부터 값을 입력받고 양수, 음수 판별
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요");
//		int number = sc.nextInt();
//		
//		if(number > 0) System.out.println("양수");
//		else if(number < 0) System.out.println("음수");
//		else System.out.println("zero");
//		--------------------------------------------------
//		반복문 실습 - 무한 반복, n번 반복
//		while(true) {
//			System.out.println("안녕");
//		}
//		for (int i = 0; i<1; ) {
//			System.out.println("안녕");
//		}
//		--------------------------------------------------
		int x = 0;
		while(x < 10) {
			System.out.println("안녕");
			x++;
		}
		
		for (int i = 0; i<10; i++) {
			System.out.println("안녕");
		}
		
		
	}

}
