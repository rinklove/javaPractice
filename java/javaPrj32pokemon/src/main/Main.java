package main;

import java.util.Scanner;

import manager.BattleManager;
import manager.PokemonManager;
import mob.Pokemon;

public class Main {
	
	public static final Scanner sc = new Scanner(System.in);
	public static Pokemon userPokemon;
	public static Pokemon enemyPokemon;

	public static void main(String[] args) {
		
		System.out.println("코펫몬ver0905");
		//포켓몬 선택
		PokemonManager pokemonManager = new PokemonManager();
		pokemonManager.selectPokemon();
		
		//배틀
		BattleManager battleManager = new BattleManager();
		battleManager.startBattle();
		System.out.println("----------코펫몬 끝----------");
	}
}
