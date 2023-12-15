package game;

import main.Main;

public class GameManager {
	
	//게임시작
	public void gameStart() {
		
		String retry="";
		// 포켓몬 선택
		PokemonManager pm = new PokemonManager();
		pm.selectPokemon();
		BattleManager bm = new BattleManager();
		bm.selectRandomEnemy();
		// 배틀하기 + 결과출력
		do {
			bm.battleStart();			
			
			System.out.println("다시 재배틀 하시려면 y키를 눌러주세요.");
			retry = Main.sc.next();
		} while(retry.equals("y"));
		
		
	}

}