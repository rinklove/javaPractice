package test;

import java.util.Scanner;

public class Run02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * 정수 a , b 를 만든다. a 가 더 크면 "a가 더 크다." 라고 출력
		b 가 더 크면 "b가 더 크다." 라고 출력
		a와 b가 같으면, "같다" 라고 출력
	 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("정수를 입력하세요");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(a+"가 "+ b+"보다 더 크다");
		} else if (a < b){
			System.out.println(b+"가 "+ a+"보다 더 크다");
		} else {
			System.out.println(a + "와 " + b +"는 같다");
		}
	}

}
