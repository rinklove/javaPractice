package main;

public class TestClass {

	public void method1() {
		System.out.println("start method1()");
		//예외 처리
		try {
			method2();			
		} catch (Exception e) {
			System.out.println("method1()에서 잡았쥬?");
		} finally {
			
		}
		System.out.println("end method1()");
	}
	
	//자신(메소드)을 호출한 곳으로 예외 던지기
	public void method2() throws Exception{
		System.out.println("start method2()");
//		int x = 3/0; // 예외 발생
		throw new Exception();
		//예외를 고의로 던진 시점부터 이후의 코드는 실행x
//		method3();
//		System.out.println("end method2()");
	}
	
	public void method3() {
		System.out.println("start method3()");
		System.out.println("end method3()");
		
	}
	
}
