package data;

public class Pokemon {

	private String name;
	private int hp;
	private int atk;
	
	public Pokemon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}



//	public void printInfo() {		
//		System.out.println("현재클래스: "+this.getClass().getSimpleName());
//		System.out.println("이름: "+name);
//		System.out.println("체력: "+hp);
//		System.out.println("공격력: "+atk);
//	}
	
	//alt+shift+s -> s
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + "]";
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
}
