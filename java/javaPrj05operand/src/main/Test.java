package main;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//연산자
		System.out.println(1>3);				//false
		System.out.println(1<3);				//true
		System.out.println(1!=3);			//true
		System.out.println(true&&true); 	//true
		System.out.println(true&&!false);	//true
		System.out.println(14 + 4 % 6); 	//18
		System.out.println(!(true&&false) && false);	//false
		System.out.println(44>>1); //44 = 00101100(2) -> 00010110(2) 
		System.out.println(44>>3); //44 = 00101100(2) -> 00000101(2)
		System.out.println(-19>>>3); // 536870909

		System.out.println(13+4.3);
		System.out.println((byte)128); //-128
		int age = 20;
		boolean isAdult = age >= 20;
		
		//문자열+정수or 실수 => 문자열
		System.out.println(age + "살이면 성인이 맞는지? " + isAdult);
		
		
		
	}
}
