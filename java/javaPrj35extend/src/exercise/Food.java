package exercise;

public class Food extends Menu{

	protected int weight;
	
	public Food(String name, int price, int weight) {
		super(name, price);
		this.weight = weight;
	}

	public void eat() {
		System.out.println(this.name +" "+this.weight+ "g 옴뇸뇸");
	}
}
