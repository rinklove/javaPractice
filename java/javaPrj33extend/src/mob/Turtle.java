package mob;

public class Turtle extends Pokemon{
	

	public Turtle() {
		super("꼬부기", 103, 26, 12);
	}

	public Turtle(int hp, int atk, int def) {
		super("꼬부기", hp, atk, def);
	}

	@Override
	public void skill() {
		System.out.println("물대포~!~!~!~!~!~!~!");
	}
	
	public void hello() {
		System.out.println("안녕~");
	}
}
