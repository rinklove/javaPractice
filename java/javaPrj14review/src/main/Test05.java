package main;

public class Test05 {
	
	public void method5() {
		System.out.println("배열");
		
		
		int[] arr = new int[5];
		
		for(int i  = 0; i<arr.length;i++) {
			arr[i] = i;
		}
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
