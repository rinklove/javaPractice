package main;

import battle.BattleManager;
import mob.Pokemon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//객체 생성 + 해당 객체의 주소를 변수에 담기
//		Pokemon p = new Pokemon(); //초기화
		BattleManager bm = new BattleManager();
		bm.battleStart();
		

		//객체 안의 변수들에 값 넣기

		//객체 안에 변수들 출력해보기
//		System.out.println(p.name);
//		System.out.println(p.hp);
		
		//객체의 attack메소드 실행
//		p.attack();
		
	}
}
