package battle;

import mob.Pokemon;

public class BattleManager {

	public void battleStart() {
		
		//포켓몬 2마리 생성
		Pokemon p1 = new Pokemon("피카츄", 106, 30);
		Pokemon p2 = new Pokemon("야도란", 90, 31);

		//번갈아가며 공격, 공격마다 데미지 계산해서 체력 감소
		int turn = 0;
		while(p1.hp > 0 && p2.hp > 0) {
			if(turn % 2 == 0) p2.attack(p1);
			else p1.attack(p2);
			turn++;
		}
		//체력이 0이 되면 승패 판단
		if(p1.hp <= 0) {
			System.out.println(p2.name+" 승리");
		} else if(p2.hp <= 0){
			System.out.println(p1.name+" 승리");
		}
		//결과 출력
	}

}
