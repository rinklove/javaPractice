package main;

import error.KhException;

public class TestClass {

	public void method1() {
		System.out.println("method1 start");
		method2();
		method_2();
		System.out.println("method1 end");
	}
	
	public void method_2() {
		System.out.println("method_2 start");
		try {
			throw new KhException("예외예외예외예외예외예외예외예외예외예외예외예외예외예외예외");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		method3();
		System.out.println("method_2 end");
	}
	
	public void method2() {
		System.out.println("method2 start");
		method3();
		System.out.println("method2 end");
	}
	
	public void method3() {
		System.out.println("method3 start");
		System.out.println("method3 end");		
	}
	
}
