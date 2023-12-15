package main;

public class KhClass implements Runnable {

	@Override
	public synchronized void run() {
		int i =0;
		while(i<5) {
			System.out.println("현재 스레드의 이름: "+ Thread.currentThread().getName());
			try {
				wait(1000);
				i++;
			} catch (Exception e) {
				break;
			}
		}
 	}

	
}
