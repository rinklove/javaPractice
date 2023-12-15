package car;

public class Sonata extends Car{

	@Override
	public void accelerate() {
		System.out.println("휘발유 사용");
		System.out.println("소나타ㄱㄱㄱㄱㄱㄱ");
	}

	@Override
	public String toString() {
		return "Sonata [price=" + this.getPrice() + ", color=" + this.getColor() + ", speed=" + this.getSpeed() + "]";
	}
}
