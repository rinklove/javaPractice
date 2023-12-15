package exercise;

public abstract class Menu {

	protected String name;
	protected int price;
		
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Menu [name=" + name + ", price=" + price + "]";
	}
	
}
