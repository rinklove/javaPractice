package manager;

import main.Main;
import mob.Pokemon;

/**
 * 배틀시작과 관련된 메서드 작성
 */
public class BattleManager {

	public void startBattle() {
		// TODO Auto-generated method stub
		
		int userHp = Main.userPokemon.getHp();
		int enemyHp = Main.enemyPokemon.getHp();
		
		Pokemon attacker = Main.userPokemon;
		Pokemon defender = Main.enemyPokemon;
		
		boolean isDead = false;
		//번갈아가면서 공격~!~!~!~!
		while(!isDead) {
			
			attacker.bodyAttack();
			
			//데미지 계산
			int damage =calcDamage(attacker.getAtk(), defender.getDef());
			System.out.println("데미지: " + damage);
			//체력감소
			enemyHp -= damage;
			System.out.println("남은 체력: " + enemyHp);
			//죽음 판단
			isDead = checkHp(enemyHp);			
			System.out.println("---------------------------------");
		}
		//결과 출력
		if(userHp <= 0)
		System.out.println(Main.enemyPokemon.getName() +"승리~!~!~!~!~!~!");
		else System.out.println(Main.userPokemon.getName() +"승리~!~!~!~!~!~!");
	}

	private boolean checkHp(int enemyHp) {
		return enemyHp <=0 ? true : false;
	}	

	private int calcDamage(int atk, int def) {
		return atk - def;
	}

}
