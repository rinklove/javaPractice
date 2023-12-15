package main;

import java.util.ArrayList;
import java.util.List;

import manager.BattleManager;
import manager.PokemonManager;
import mob.Pokemon;

public class Main {
	
	public static List<Pokemon> list = new ArrayList<>();
	public static Pokemon userPokemon;
	public static Pokemon enemyPokemon;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//포켓몬 선택
		PokemonManager pokemonManager = new PokemonManager();
		pokemonManager.selectPokemon();
		//배틀
		BattleManager battleManager = new BattleManager();
		battleManager.startBattle();
		
	}

}
