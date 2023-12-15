package mob;

public class Pikachu extends Pokemon{

	
	
	public Pikachu() {
		super("피카츄", 100, 30, 10);
	}

	public Pikachu(int hp, int atk, int def) {
		super("피카츄", hp, atk, def);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skill() {
		System.out.println("백만볼트~!~!~!~!~!~!~!~!~!");
	}
}
