package main;

public class CounterEmp {

	private String name;

	public CounterEmp() {
		//현재 객체에 데이터 추가 
		this("신입"); 
		System.out.println("열심히 일하겠슴다");
	}
	
	public CounterEmp(String name) {
		this.name = name;
		System.out.println("저는 "+this.name+"임다. 열심히 일하겠슴다");
	}
}
