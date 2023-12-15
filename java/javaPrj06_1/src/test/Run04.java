package test;

import java.util.Scanner;

public class Run04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*정수형 변수를 만든다.
		변수가 홀수라면, "홀수" 라고 출력
		변수가 짝수라면, "짝수" 라고 출력
		0 이라면, "zero" 라고 출력*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		if(num  == 0) {
			System.out.println("zero");
		} else if(num % 2 == 0){
			System.out.println("짝수");
		} else if(num % 2 ==1 ) {
			System.out.println("홀수");
		}
	}

}
