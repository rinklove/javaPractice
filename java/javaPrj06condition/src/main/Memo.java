package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {10, 40, 30, 25, 67, 23};
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		for (int index : arr) {
//			System.out.println(index);
//			list.add(index);
//		}
//		System.out.println("-------------------");
//		list.sort(Collections.reverseOrder());
//		list.remove(list.size()-1);
//		
//		for (int i=0;i<arr.length; i++) {
//			arr[i] = list.get(i);
//		}
		//문자열 내림차순 정렬
		
		String s = "Zbcdefg";
		//'A' = 65, Z=90 a=97 z=122
		System.out.println('z'- 0);
		char[] arr= s.toCharArray();
		char tmp;
	
		StringBuffer buffer  = new StringBuffer();
		String new_str = buffer.append(arr).toString();
		System.out.println(new_str);
	
	
		
	}

}
