package emp;

import java.util.List;

import menu.Burger;

public class CounterEmp {

	public void showBurgerMenu(List<Burger> list) {
		for(Burger b : list) {
			System.out.println(b);
			b.setPrice(0);
		}
	}
}
