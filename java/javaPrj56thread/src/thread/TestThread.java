package thread;

public class TestThread extends Thread{

	@Override
	public void run() {
		int i =1;
		while(i< 10) {
			System.out.println("스레드 출력");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			i++;
		}
	}

	
}
