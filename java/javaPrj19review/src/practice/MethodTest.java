package practice;

/**
 * 메소드 : 명령어의 집합
 *	형태
 *	접근 제한자 반환 자료형 메소드 이름(매개변수) { 명령어 }
 *	메소드는 동사형태로 작성하는 게 좋음
 *	메소드의 명령은 가능한 한 작은 단위로 작성하는게 좋음
 */
public class MethodTest {
	

	//받는 데이터x, 반환하는 데이터x
	public void test() {
		System.out.println("test1");
	}
	
	//받는 데이터o 반환하는 데이터x
	public void test(int num) {
		System.out.println(num);
	}

	public void test(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	//받는 데이터x, 반환하는 데이터o
	public int test3() {
		return 123;
	}
	//받는 데이터o, 반환하는 데이터o
	public int test4(int a, int b) {
		return a+b;
	}
	
}
