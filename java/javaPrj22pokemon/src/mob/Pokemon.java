package mob;

public class Pokemon {
	
	
	//멤버생성
	public String name;
	public int hp;
	public int atk;
	
	
	public Pokemon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}


	public void attack(Pokemon p) {
		System.out.println("-------------------------------------");
		int damage = (int) (Math.random()* (this.atk*0.4) + (this.atk*0.7));
		System.out.println(this.name+"이(가) "+p.name+"을(를) "+damage+"만큼 공격함");
		p.hp -= damage;
		System.out.println(p.name+"의 남은 체력: "+p.hp);
		System.out.println(this.name+"의 남은 체력: "+this.hp);
	}
}
