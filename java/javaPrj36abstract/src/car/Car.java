package car;

public abstract class Car {

	private int price;
	private String color;
	private int speed;
	
	public Car() {
		super();
	}

	//추상메소드
	public abstract void accelerate();

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + ", color=" + color + ", speed=" + speed + "]";
	}

}
