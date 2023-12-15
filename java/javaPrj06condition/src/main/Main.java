package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(true) {
			System.out.println("출력문 실행");
		} 
		
//		int age = 10;
//		if (age >= 20) {
//			System.out.println("성인");
//		} else {
//			System.out.println("미성년자");
//		}
		
		int num = 0;
		if(num > 0) {
			System.out.println("양수");
		} else if(num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0입니다.");
		}
		
		//실습
		int a = 10;
		int b = 50;
		int min, max;
		
		if(a > b) {
			max=a;
			min=b;	
		} else {
			max=b;
			min=a;
		}
		System.out.println("큰 값: " + max+ " 작은 값: " + min);
		
		//문자열의 가운데 글자 추출, 길이가 짝수개면 가운데에 위치한 2개 문자열 추출
		String str = "안녕하세요";
		int n = str.length();
		if( (n % 2)  == 1 ) {
			System.out.println(str.subSequence(n/2, n/2+1).toString());
		} else if((n%2) == 0 ) {
			System.out.println(str.subSequence(n/2-1, n/2+1).toString());
		}

		/*
		 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, 
		 * solution을 완성하세요. 
		 * 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
		 */
		String sr = "12455";
		StringBuffer sb = new StringBuffer();
		
		
	
		
	}
	

}
