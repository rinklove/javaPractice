package mob;

public class Pokemon {

	//멤버변수
	protected String name;
	protected int hp;
		
	public void bodyAttack() {
		System.out.println(this.name +"의 몸통 박치기~!~!~!~!~!");
	}
	
	public void skill() {
		System.out.println("스킬사용~!~!~!~!~!~!");
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + "]";
	}
	
}
