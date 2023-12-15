package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----generic-----");
		
		//객체 생성하면서 Generic 형성
		MyBox<String> box = new MyBox<>();
		box.data = "ZZZZZzzzz";
		
	}
}
