package car;


public class Car {
	
	protected int price;
	protected String color;
	protected int speed;
	
	public void accelerate() {
		System.out.println("부아앙");
	}

	//오버라이드 된 메소드는 리턴타입도 같아야함
	//접근 범위는 부모의 메서드에서 정의된 것과 같거나 더 넓어야함
	//부모-public, 자식-protected (x) //부모-default, 자식-protected (o)
	@Override
	public String toString() {
		return "Car [price=" + price + ", color=" + color + ", speed=" + speed + "]";
	}

}
