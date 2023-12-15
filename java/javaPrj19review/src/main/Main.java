package main;

import practice.ArrayTest;
import practice.ControlTest;
import practice.MethodTest;
import practice.OperatorTest;
import practice.VarTest;

public class Main {

	public static void main(String[] args) {

		System.out.println("복습");
		
//		VarTest test = new VarTest();
//		
//		//다른 패키지에 있는 클래스를 import하면 
//		//public이 붙어있는 메소드및 변수만 접근 가능
//		test.test();
//		
//		OperatorTest opTest = new OperatorTest();
//		opTest.multipleOper(10, 4);
		
//		ControlTest cTest = new ControlTest();
//		cTest.test();
		
//		ArrayTest aTest = new ArrayTest();
//		aTest.test();
		
		MethodTest mTest = new MethodTest();
		
		mTest.test();
		mTest.test(1000);
		mTest.test(10, 20);
		System.out.println(mTest.test3());
		mTest.test3();
		System.out.println(mTest.test4(50, 40));
	}

}
