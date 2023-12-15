package main;

public class Main {

	public static void main(String[] args) {
		
		String s1 = "hello";
//		System.out.println(s1);
		
		String s2 = "hello"; //리터럴 방식으로 생성
		System.out.println(s2);
//		System.out.println(s1==s2); //true
		
		s1 = new String("hello"); //객체 생성 방식으로 생성
//		System.out.println(s1==s2); //false
		
		String s3 = new String("hello");
		String s4 = "hello";
		//다 false
//		System.out.println(s1 == s2);
//		System.out.println(s1 == s3);
//		System.out.println(s1 == s4);
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
		System.out.println(s2 == s4); // true
		
		
		
	}
}
