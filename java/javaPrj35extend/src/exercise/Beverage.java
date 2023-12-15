package exercise;

public class Beverage extends Menu{

	protected int volume;
	
	public Beverage(String name, int price, int volume) {
		super(name, price);
		this.volume = volume;
	}

	public void eat() {
		System.out.println(this.name+" " + this.volume +"ml 옴뇸뇸");
	}
}
