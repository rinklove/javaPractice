package main;

import car.Avante;
import car.Car;
import car.Lucid;
import car.Sonata;

public class Main {

	public static void main(String[] args) {
		
		int n = 5;
		Car s = new Sonata();
		Car a = new Avante();
		
		Car[] cars = new Car[n];
		for(int i =0;i<n; i++) {
			switch(i%3) {
				case 0: cars[i] = new Sonata(); break;	
				case 1: cars[i] = new Avante(); break;	
				case 2: cars[i] = new Lucid(); break;	
			}
			
		}

		for(Car c : cars) {
			System.out.println(c);
		}
		System.out.println("-_-_-_-_-_-_-_-_-_");
		//같은 계층에 있는 자식 클래스끼리는 다형성 적용x
//		Sonata so = new Avante();
		
		s.setPrice(1000000);
		s.setSpeed(300);
		s.setColor("black");
		System.out.println(s);
		System.out.println(a);
		
		s.accelerate();
		a.accelerate();
			
	}
}
