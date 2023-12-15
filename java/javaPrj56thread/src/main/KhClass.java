package main;

public class KhClass implements Runnable{

	@Override
	public synchronized void run() {
		int i =1;
		while(i< 10) {
			System.out.println("러너블 출력");
			try {
				this.wait(1500);
				notify();
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
			i++;
		}
	}

	
}
