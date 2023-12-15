package main;

import java.util.List;
import java.util.Map;

public class PrintMenu {

	
	public void setMenu(List<Menu> list) {
		list.add(new Menu("아메리카노", 2500));
		list.add(new Menu("카페라떼", 3000));
		list.add(new Menu("카페모카", 3500));
		list.add(new Menu("자두주스", 4000));
		list.add(new Menu("망고주스", 4500));
	}
	public void setMenu(Map<Integer, Menu> list) {
		list.put(1, new Menu("아메리카노", 2500));
		list.put(2, new Menu("카페라떼", 3000));
		list.put(3, new Menu("카페모카", 3500));
		list.put(4, new Menu("자두주스", 4000));
		list.put(5, new Menu("망고주스", 4500));
	}
	
	public void printAll(List<Menu> list) {
		for(Menu m : list) 
			System.out.println(m);
	}
	
	public void printAll(Map<Integer, Menu> map) {
		for(int i =0; i<map.size(); i++) {
			System.out.println(map.get(i));
		}
	}
	
	public void printSort(List<Menu> list) {
		for(Menu m : list) {
			System.out.print(m.getName() +"\t");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		//여러개의 객체 전부 다 출력(price의 필드만 출력)
		for(Menu m : list) {
			System.out.print(m.getPrice() +"원\t");
		}
	}
	
	public void printSort(Map<Integer, Menu> map) {
		for(int i =0; i<map.size(); i++) {
			System.out.println(map.get(i).getName());
		}
		System.out.println();
		System.out.println("---------------------------------------");
		//여러개의 객체 전부 다 출력(price의 필드만 출력)
		for(int i =0; i<map.size(); i++) {
			System.out.println(map.get(i).getPrice()+"원");
		}
	}
}
