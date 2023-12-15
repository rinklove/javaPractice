package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 선언, 변수 30개 사용가능
		int[] arr = new int[3];
		int y = 10;
		
		//배열의 각 요소 접근 방법, 0부터 시작
		for(int i=0;i<3;i++) {
			arr[i] = i+1;
			System.out.println(arr[i] + " ");
		}
		System.out.println(arr); // arr[0]의 주소값을 반환 
		
	}

}
