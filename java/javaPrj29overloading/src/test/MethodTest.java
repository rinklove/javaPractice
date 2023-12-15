package test;

public class MethodTest {

	public void plus(int x) {
		System.out.println(++x);
	}
	
	public void plus(double x, int y) {
		System.out.println(x+y);
	}
	
	public void plus(int x, double y) {
		System.out.println(x+y);
	}
	
}
