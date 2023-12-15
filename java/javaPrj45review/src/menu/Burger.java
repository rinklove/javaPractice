package menu;

public class Burger {

	private String name;
	private int price;
	
	public Burger(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Burger [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
