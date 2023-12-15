package main;

import java.util.Scanner;

public class Updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100사이의 난수 생성
		int num = (int) (Math.random() * 100 + 1);
		//유저한테서 정답을 입력받기 위한 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int count=0;
		
		while(flag) {
				System.out.println("숫자를 입력하세요");
			//입력을 받는 코드, 받을 때까지 대기
			int input =sc.nextInt();
			count++;
			
			if(input == num) {
				System.out.println("정답입니다 "+count+ "번 만에 맞추셨습니다");
				flag = false;
			} else {
				if(input < num) {
					System.out.println("up");
				} else if(input > num) {
					System.out.println("down");
				}
			}
		}
	}
}
