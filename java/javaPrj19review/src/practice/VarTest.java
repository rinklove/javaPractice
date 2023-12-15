package practice;

/**
 * 변수 복습
 */
public class VarTest {
	
	/*
	 * 선언, 할당, 초기화
	 * int x;  		//선언
	 * x = 10;	//할당
	 * int y =5;	//초기화
	 * 상수(final) => 재할당 불가능
	 * 변수 명명규칙 - camelCase, 직관적으로 
	 * 주의사항 - 앞에 숫자로 시작할 수 없음, 변수에 사용 가능한 특수문자: $, _
	 * 변수의 스코프(지역변수) - 선언된 영역 내에서만 생존
	 * 참조자료형의 기본값은  null임
	 */
	
	public void test() {
		int x;  	//선언
		x = 10;	//할당
		int y =5;	//초기화
		
		System.out.println(x);
		System.out.println(y);
		
	}
}
