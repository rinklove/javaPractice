package game.updown;

import game.GameManager;
import main.Main;

/**
 * 업다운 게임 클래스
 */
public class UpDownGameManager {
	
	/**
	 * 업다운 게임 실행
	 */
	public void startUpDown() {
		int answer = (int)(Math.random()* 99 +1);
		int count = 0;
		boolean isAnswer = false;
		while(!isAnswer) {
			System.out.println("정수를 입력하세요");
			int input =Integer.parseInt(Main.scanUserInput()); 
			count++;
			
			if(input == answer) {
				System.out.println("정답입니다. " +count + "번 만에 맞추셨습니다" );
				System.out.println("게임을 종료합니다");
				isAnswer = true;
			} else {
				if(input > answer) System.out.println("down");
				else System.out.println("up");
			}
		}
		
	}

	
}
