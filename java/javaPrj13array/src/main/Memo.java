package main;


import java.util.ArrayList;


public class Memo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,1,2,3};
		
		int[] answer= arr;
		int min = arr[0];
		int index=0;
		ArrayList<Integer> list = new ArrayList<>();
		
		if(arr.length == 1) {
			answer[0] = -1;			
		}else {
			for(int i = 0 ;i <arr.length; i++) {
				list.add(arr[i]);
				if(arr[index] > arr[i]) {
					index = i;
				}
			}
		}
		list.remove(index);
		
		for(int i =0;i<list.size();i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}
		
	}

}
