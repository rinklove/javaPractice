package main;

public class HongGilDong implements Programmer, Fisherman{

	@Override
	public void coding() {
		System.out.println("코딩해");
	}

	@Override
	public void fishing() {
		System.out.println("낚시해");
	}
	
}
