package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		UpDownHelper helper = new UpDownHelper();
		
		helper.printStartMsg();
		helper.printGameInfo();
		
		int random = helper.prepareRandomAnswer();
		int count = 0;
		int input;
		boolean flag = true;
		
		while(flag) {
			input = helper.scanUserInput(sc);
			count++;
			
			flag = helper.checkNum(input, random);
		}
		helper.getResult(count, random);
	}

}
