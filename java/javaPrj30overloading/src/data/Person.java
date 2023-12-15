package data;

public class Person {

	private String name;
	private int age;

	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void breathe() {
		System.out.println("breathe in breathe out");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFieldInfo() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
