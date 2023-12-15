package main;

import mob.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("복습2222");
		
		Pokemon p = new Pokemon();
		p.setAtk(23);
		p.setHp(100);
		p.setName("피카츄");
		
		System.out.println(p.getFieldinfo());
	}
}
