package practice;

/**
 * 제어문 - 프로그램의 
 */
public class ControlTest {

	/*
	 * 조건문
	 * if, if - else, else, switch, 삼항 연산자
	 * 
	 * 반복문
	 * for - 몇 번 반복해야 할 지 알 때
	 * while - 몇 번 반복해야할 지 모를 때
	 * do-while
	
	 * break, continue => 제어문, 반복문에서 둘다 사용가능
	 */
	
	/**
	 * 어떤 숫자가 양수인지 음수인지 0인지 판단
	 * 숫자 1~ 100출력
	 */
	public void test() {
		int num = 1;
		for(int i =num; i<=100; i++) {
			System.out.println(i);
		}
	}
}
