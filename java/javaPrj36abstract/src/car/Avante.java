package car;

public class Avante extends Car{

	@Override
	public void accelerate() {
		System.out.println("경유 사용");
		System.out.println("아반떼ㄱㄱㄱㄱㄱㄱ");
	}
	
	@Override
	public String toString() {
		return "Avante [price=" + this.getPrice() + ", color=" + this.getColor() + ", speed=" + this.getSpeed() + "]";
	}

}
