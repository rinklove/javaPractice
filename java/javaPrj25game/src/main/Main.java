package main;

import java.util.Scanner;

import game.GameManager;

public class Main {

	public final static Scanner sc = new Scanner(System.in);
	
	public static String scanUserInput() {
		return Main.sc.nextLine();
	}
	
	public static void main(String[] args) {
		
		GameManager gm =new GameManager();
		
		while(true) {
			gm.printGameInfo();
			
			//게임 번호 입력
			String number = Main.scanUserInput();
			//게임시작
			switch(number) {
			case "1": gm.startUpDown(); break;
			case "2": gm.startRcp(); break;
			case "3": gm.startPokemon(); break;
			case "9": System.out.println("프로그램을 종료합니다"); return;
			default: System.out.println("잘못입력하셨습니다"); break;
			}			
		}
	}
}
