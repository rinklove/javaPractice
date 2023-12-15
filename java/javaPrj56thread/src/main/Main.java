package main;


import thread.TestThread;

public class Main {

	public static  void main(String[] args) {
		
		System.out.println("스스레드");
		
		Thread t  = new TestThread();
		Thread k = new Thread(new KhClass());
		k.start();
		t.start();
		Thread z = new Thread(() -> {System.out.println("얍얍얍");});
		
		}
//		Thread x = Thread.currentThread();
//		System.out.println(x.getName()); //main

}
