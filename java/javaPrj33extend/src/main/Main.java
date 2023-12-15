package main;

import mob.Pairi;
import mob.Pikachu;
import mob.Pokemon;
import mob.Turtle;

public class Main {

	public static void main(String[] args) {
		
		System.err.println("상속ㅏ|ㅓ속상");
		
//		 Pokemon p = new Pokemon();
//		 p.setName("와랄라");
//		 p.setHp(100);
//		 p.setAtk(20);
//		 p.setDef(7);
//		 
//		 System.out.println(p.getName());
//		 System.out.println(p.getHp());
//		 System.out.println(p.getAtk());
//		 System.out.println(p.getDef());
//		 
//		 System.out.println(p.toString());
		
		//다형성 - 자식 객체를 부모 클래스 자료형에 담을 수 있음
		// -> 이렇게 만들어진 객체는 
		//자식클래스가 따로 가지고 있는 메소드나 변수는 불러올 수 없음
		Pokemon pikachu  = new Pikachu();
		System.out.println(pikachu.toString());
		pikachu.bodyAttack();
		
		Pokemon pairi = new Pairi();
		System.out.println(pairi.toString());
		pairi.bodyAttack();
		pairi.skill();
		
		Pokemon p = new Turtle();
			Turtle turtle = (Turtle) p;

	}
}
