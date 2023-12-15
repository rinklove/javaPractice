package mob;

public class Pokemon {

	public String name;
	public int hp;
	public int atk;
	public int def;
	
	public void attack() {
	System.out.println("공격");
	this.hp  -= this.atk;
	System.out.println("남은 체력: " + this.hp);
	}
}
