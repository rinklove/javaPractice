package main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] student = new int[3];
		
		for(int i =0;i<student.length;i++) {
			System.out.println("학생"+(i+1)+"의 성적을 입력하세요");
			student[i]=sc.nextInt();
		}
		
		for(int i =0;i<student.length;i++) {
			System.out.println("학생"+(i+1)+"의 성적: "+ student[i]);
		}
	}

}
