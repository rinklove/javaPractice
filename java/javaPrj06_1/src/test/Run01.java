package test;

import java.util.Scanner;

public class Run01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*정수형 변수를 만든다.
		10 보다 작으면 small 출력
		아니면, big 출력*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if( num > 10) {
			System.out.println("big");
		} else if (num < 10) {
			System.out.println("small");
		} else {
			System.out.println("zero");
		}
	}

}
