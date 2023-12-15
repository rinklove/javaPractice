package game;

import main.Main;
import mob.Pokemon;

public class BattleManager {
	
	Pokemon enemyPokemon;	//적 포켓몬 

	//배틀 : 유저가 선택한 포켓몬 vs 랜덤 적 포켓몬
	public void battleStart() {
		//랜덤으로 적 포켓몬 선택
//		selectRandomEnemy();
		System.out.println("나의 포켓몬 " + Main.userPokemon.name);
		System.out.println("상대방의 포켓몬 "+Main.enemyPokemon.name);
		//유저포켓몬과 적 포켓몬 배틀
		Pokemon winner = fight(Main.userPokemon , Main.enemyPokemon);
		//승자 출력
		
	}

	public Pokemon fight(Pokemon attacker, Pokemon defender) {
		Pokemon winner = null;
		attacker.hp =attacker.fullHp;
		defender.hp =defender.fullHp;
		int turn = 1;
		while(winner==null) {
			//번갈아가면서 공격
			if(turn % 2 ==0)winner = attacker.bodyAttack(defender);	//ㅇㅇㅇ 의 몸통박치기 !
			else winner = defender.bodyAttack(attacker);
			turn++;
		}
		System.out.println(winner.name + "  승리~~~~");
		return winner;
	}

	public void selectRandomEnemy() {
		//랜덤값에 따라 enemyPokemon 에 값 셋팅
		//enemyPokemon 은 다른 메소드에서도 쓰일 예정이므로 멤버변수로 만듦
		
		//1~3 사이의 랜덤 값 준비
		int random = (int) (Math.random() * 3 + 1);
		
		//랜덤값에 따라 적 포켓몬 준비
		switch(random) {
			case 1 : Main.enemyPokemon = new Pokemon(Main.p1); break;
			case 2 : Main.enemyPokemon = new Pokemon(Main.p2); break;
			case 3 : Main.enemyPokemon = new Pokemon(Main.p3); break;
			default : System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
	
	

}