package main;

import java.util.Scanner;

public class UpDownHelper {
	
	public void printStartMsg() {
		System.out.println(" ---------------------------------");
		System.out.println("|            UPDOWN GAME          |");
		System.out.println(" ---------------------------------");
	}
	
	public void printGameInfo() {
		System.out.println("1~100사이의 랜덤 숫자를 맞추는 게임");
		System.out.println("자연수만 입력가능");
		System.out.println("맞출 때까지 반복하며 맞추면 시도 횟수 나옴");
	}

	public int prepareRandomAnswer() {
		return (int) (Math.random() *100 +1);
	}
	
	public int scanUserInput(Scanner sc) {
		System.out.print("정수를 입력해주세요: ");
		return sc.nextInt();
	}
	
	public boolean checkNum(int input, int random) {
		if(input == random) {
			System.out.println("맟춰야 할 숫자: " + random);	
			return false;
		} else {
			if(input > random) System.out.println("down");
			else if(input < random) System.out.println("up");
			return true;
		}
	}
	
	public void getResult(int count, int random) {
		System.out.println("정답입니다. " + count + "번 만에 맞추셨습니다.");
		System.out.println("random: " + random);
	}

}
