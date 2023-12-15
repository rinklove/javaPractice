package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--------메소드--------");
		
		//같은 패키지 안에 있을 때는 import 없이 생성 가능
//		GameController controller = new GameController();
//		controller.printInfo();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MethodTest t = new MethodTest();
		t.printNumber(n);
	}
}
