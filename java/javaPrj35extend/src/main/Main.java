package main;

import car.Avante;
import car.Car;
import car.Sonata;
import exercise.Beverage;
import exercise.Food;
import exercise.Menu;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("상속속상");
		
		Car a = new Avante();
		Car s = new Sonata();
		
		
		a.accelerate();
		s.accelerate();

		
	}
}
