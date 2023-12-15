package main;

public class TestClass {

	public void method1() {
		System.out.println("method1");
		Person p = new Person();
		p.age = 20;
		method2(p);
		System.out.println(p.age); //0
	}
	
	public void method2(Person p) {
		System.out.println("method2");
		p.age = 0;
	}
}
