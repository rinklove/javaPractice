package main;

import java.util.ArrayList;
import java.util.List;

import menu.Burger;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("맹날");
		
		Burger burger = new Burger("띠드버거", 5000);
		Burger burger2 = new Burger("감쟈버거", 4000);
		Burger burger3 = new Burger("오이버거", 3000);
		
		Burger[] burgers = new Burger[3];
		burgers[0] = burger;
		burgers[1] = burger2;
		burgers[2] = burger3;
		
		List<Burger> list = new ArrayList();
		for(Burger b : burgers) {
			list.add(b);
		}
		
		for(Burger b : burgers) {
			System.out.println(b);
		}
	}
}
