package mob;

import util.MyUtil;

public class Pokemon {

	public static final String NAME01 = "피카츄";
	public static final String NAME02 = "파이리";
	public static final String NAME03 = "꼬부기";
	private static final int MIN_ATK = 20;
//	private static final int MAX_DEF = 10;
	
	private String name;
	private int hp;
	private int atk;
	private int def;
	
	public Pokemon() {}
	
	public Pokemon(String name) {
		this.name = name;
		this.hp = 100;
		int random = MyUtil.getRandomInt(MIN_ATK, 30);	//20 ~ 30사이의 값
		this.atk = random;
		this.def = 30 - atk;
	}

	public Pokemon(String name, int hp, int atk, int def) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}

	public void bodyAttack() {
		System.out.println(this.name + "의 몸통박치기!");
	}
	 public void skill() {
		 System.out.println(this.name + "의 스킬공격!");		 
	 }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	@Override

	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + "]";
	}
	
}
