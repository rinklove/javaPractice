package main;

public class Test03 {

	public void method1() {
		System.out.println("제어문");
		
		int x = 10;
		
		if(x<0) {
			System.out.println("음수");
		} else if(x>0) {
			System.out.println("양수");
		} else if(x==0) System.out.println("0");
	}
}
