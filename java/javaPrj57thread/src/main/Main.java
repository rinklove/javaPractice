package main;

public class Main {

	public static void main(String[] args) {
		//
		System.out.println("-------스레드-------");
		
		//스레드 이름 출력
		Thread t0 = Thread.currentThread();
		System.out.println(t0.getName()); //main
		
		Thread t1 = new Thread(new KhClass());
		
		t1.start();

	}
}
