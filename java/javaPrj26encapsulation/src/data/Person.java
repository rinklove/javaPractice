package data;

public class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age-1;
	}
	public void setAge(int age) {
		if(age > this.age) 
			this.age = age;
		else System.out.println("나이 거꾸로 드시면 안됩니다");
	}
	
}
