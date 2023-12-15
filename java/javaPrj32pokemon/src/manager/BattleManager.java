package manager;

import main.Main;
import mob.Pokemon;
import util.MyUtil;

public class BattleManager {

	public void startBattle() {
		
		boolean isFinish = false;
		int num;
		//두 코펫몬 정보 출력
		printPokemonInfo();
		
		while(true) {
			//유저행동 입력(1. 몸통 박치기, 2. 스킬)
			 num = scanUserAction();
			
			isFinish = fight(Main.userPokemon, Main.enemyPokemon, num);
			if(isFinish) {
				System.out.println("유저 승리~!~!~!~!~!");
				System.out.println("----------코펫몬 배틀 끝----------");
				return;
			}
			
			//적 행동 랜덤으로 진행
			isFinish = fight(Main.enemyPokemon, Main.userPokemon, MyUtil.getRandomInt(1, 2));
			if(isFinish) {				
				System.out.println("유저 패배~!~!~!~!~!");
				System.out.println("----------코펫몬 배틀 끝----------");
				return;					
			}
		}
	}

	private int scanUserAction() {
		System.out.println("행동을 선택하세요");
		printActionList();
		//유저 행동 선택하기
		return Main.sc.nextInt();
	}


	private boolean fight(Pokemon attacker, Pokemon defender, int num) {
		//공격메소드 호출
		switch(num) {
			case 1: attacker.bodyAttack(); break;
			case 2 : attacker.skill(); break;
		}
		
		//데미지 계산
		int damage = attacker.getAtk() *num - defender.getDef();
		System.err.println(attacker.getName()+"의 데미지: " + damage);
		//체력 감소
		defender.setHp(defender.getHp()-damage);
		System.out.println(defender.getName()+"의 남은 체력: " + defender.getHp());
		//죽었는지 체크
		if(defender.getHp() <=0) return true;
		else return false;
	}

	private void printActionList() {
		System.out.println("1. 몸통박치기");
		System.out.println("2. 스킬 사용");
	}

	private void printPokemonInfo() {
		System.out.println("--------------유저 포켓몬--------------");
		System.out.println("나의 포켓몬: "+Main.userPokemon.toString());
		System.out.println("--------------상대 포켓몬--------------");
		System.out.println("상대방의 포켓몬: "+Main.enemyPokemon.toString());
	}

}
