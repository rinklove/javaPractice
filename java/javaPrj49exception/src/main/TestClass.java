package main;

public class TestClass {

	public void method1() {
		System.out.println("start method1()");
		method2();
		System.out.println("end method1()");
	}
	
	public void method2() {
		System.out.println("start method2()");
		int[] arr = new int[3];
		try {
			//예외가 발생할 것으로 예상하는 코드
			int x = 3/ 0;
			arr[3] = 10;			
		} catch(IndexOutOfBoundsException e) {
			//예외가 발생했을 때 처리하는 코드
			System.out.println("인덱스 예외 발생해서 잡혔지롱~");
		} finally {
			//예외가 발생했든 안했든 간에 반드시 실행하는 부분
			System.out.println("반드시 실행하는 부분");
		}
		method3();
		System.out.println("end method2()");
	}
	
	public void method3() {
		System.out.println("start method3()");
		System.out.println("end method3()");
		
	}
}
