package main;

public class Make2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2차원 배열
		//[[ , , ],	[ , , ], 	[ , , ]]			
		int[][] x = new int[3][3];
		int num =10;
		for(int i =0; i<x.length; i++) {
			for(int j =0; j<x[i].length;j++) {
				x[i][j] = num;
				num += 10;
			}
		}
		for(int i =0; i<x.length; i++) {
			for(int j =0; j<x[i].length;j++) {
				System.out.println(x[i][j]);
			}
		}
		
	}

}
