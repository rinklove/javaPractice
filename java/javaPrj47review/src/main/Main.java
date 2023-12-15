package main;

import java.util.ArrayList;
import java.util.List;

import emp.CounterEmp;
import menu.Burger;

public class Main {

	public static void main(String[] args) {
		
		List<Burger> list = new ArrayList();
		list.add(new Burger("치즈버거", 5000));
		list.add(new Burger("감자버거", 5000));
		list.add(new Burger("초코버거", 5000));
		list.add(new Burger("떡버거", 5000));
		list.add(new Burger("망고버거", 5000));
		
		CounterEmp counterEmp = new CounterEmp();
		for(Burger b : list) {
			System.out.println(b);
			b.setPrice(0);
		}

		counterEmp.showBurgerMenu(list);
	}
}
