package game;

import game.rcp.RcpGameManager;
import game.updown.UpDownGameManager;


public class GameManager {

	/**
	 * 게임 시작문 출력
	 */
	public void printGameInfo() {
		System.out.println("\n");
		System.out.println("미니 게임 천국");
		System.out.println("게임 종류를 선택하세요");
		System.out.println("1. 업다운 게임");
		System.out.println("2. 가위바위보");
		System.out.println("3. 포켓몬");
		System.out.println("9. 천국 탈출하기");
	}
	

	public void startUpDown() {
		UpDownGameManager manager = new UpDownGameManager();
		manager.startUpDown();
	}

	public void startRcp() {
		RcpGameManager manager = new RcpGameManager();
		manager.startRcp();
	}

	public void startPokemon() {
		
	}
}
