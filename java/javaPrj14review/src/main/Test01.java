package main;

public class Test01 {

	//변수 테스트 코드
	public void hello() {
		
		System.out.println("변수");
		//기본 자료형
		//컴퓨터는 타입이 다르면 계산x
		//-> 자바는 알아서 타입 변환을 해줌(auto casting) or 강제 형변환 가능
		
		//변수는 camelCase, 예약어x, 특수문자 $, _ 제외 나머지 불가능
		int a = 10;
		byte b = 127;
		long c = 20;
		double d = 3.14;
		boolean isTrue = true;
		char ch = 'a'; //문자
		
		// 참조 자료형
		String s = "dodo"; //문자열(문자의 배열)
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(isTrue);
		System.out.println(ch);
		System.out.println(s);
		//
	}

}
