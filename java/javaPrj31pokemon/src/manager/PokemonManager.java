package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import main.Main;
import mob.Pokemon;

//포켓몬 선택
public class PokemonManager {

	public void selectPokemon() {
		// TODO Auto-generated method stub
	
		//코펫몬 준비
		generatePokemon();
		//코펫몬 정보 출력
		printPokemonInfo();
		int num = scanUserInput()-1;
		//유저가 선택
		setUserPokemon(num);	
		//상대도 포켓몬 선택
		setEnemyPokemon();
	}
	
	private void setEnemyPokemon() {
		Main.enemyPokemon = Main.list.get((int)(Math.random()*3));
	}

	private void setUserPokemon(int num) {
		Main.userPokemon = Main.list.get(num);
	}
	
	private int scanUserInput() {
		return new Scanner(System.in).nextInt();
	}
	
	private void printPokemonInfo() {
		System.out.println("포켓몬을 선택하세요.");
		for(int i=0; i<Main.list.size(); i++) {
			System.out.println((i+1) +". " + Main.list.get(i).toString());
		}
 	}

	/**
	 * 포켓몬 생성 메소드
	 * @return
	 */
	private List<Pokemon> generatePokemon() {
		
		Main.list.add(new Pokemon("피카츄", 100, 30, 5));
		Main.list.add(new Pokemon("파이리", 100, 33, 3));
		Main.list.add(new Pokemon("꼬부기", 100, 25, 10));
		return Main.list;
		

		
	}
}
