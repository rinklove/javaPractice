package car;

public class Lucid extends Car{

	@Override
	public void accelerate() {
		System.out.println("전기 사용");
		System.out.println("루시드ㄱㄱㄱㄱㄱㄱ");
	}
	
	@Override
	public String toString() {
		return "Lucid [price=" + this.getPrice() + ", color=" + this.getColor() + ", speed=" + this.getSpeed() + "]";
	}

}
