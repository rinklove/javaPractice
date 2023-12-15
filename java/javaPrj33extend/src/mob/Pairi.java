package mob;

public class Pairi extends Pokemon{

	public Pairi() {
		super("파이리", 92, 28, 15);
	}

	public Pairi(int hp, int atk, int def) {
		super("파이리", hp, atk, def);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skill() {
		System.out.println("파이어볼~!~!~!~!~!~!~!");
	}
	
}
