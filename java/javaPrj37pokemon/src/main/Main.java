package main;

import mob.Pairi;
import mob.Pikachu;
import mob.Pokemon;
import mob.Turtle;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("포켓몬으로 상실속습");
		
		int n = 5;
		Pokemon[] pokemons = new Pokemon[n];
		
		for(int i =0; i<n;i++) {
			switch(i%3) {
			case 0: pokemons[i] = new Pikachu(100,30,10); break;
			case 1: pokemons[i] = new Pairi(95,35,8); break;
			case 2: pokemons[i] = new Turtle(102,25,13); break;
			}
		}
		
		for(Pokemon p : pokemons) {
			p.bodyAttack();
			p.skill();
			System.out.println(p);
			System.out.println();
		}
		
	}
}
