package main;

import mob.Pairi;
import mob.Pikachu;
import mob.Pokemon;

public class Main {
 
	public static void main(String[] args) {
		
		System.out.println("상속속상 연습");
		
		Pokemon p1 = new Pairi();
		p1.skill();
		p1.bodyAttack();
		
		Pokemon p2 = new Pikachu();
		p2.skill();
		p2.bodyAttack();
		p1.skill();
		
	}
}
