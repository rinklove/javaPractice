package test;

import java.util.Scanner;

public class Run03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 정수형 변수를 만든다. 
		 * 해당 수 가 7의 배수라면, "lucky" 라고 출력 
		 * 아니라면, "happy" 라고 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		String keyWord = num % 7 == 0? "lucky" : "happy";
		System.out.println(keyWord);
	}

}
