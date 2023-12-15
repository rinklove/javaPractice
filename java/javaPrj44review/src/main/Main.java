package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("복습");
		
		 List<Menu> menuList = new ArrayList<>();
		 
		 Stack<Menu> stack = new Stack();
		 Map<Integer, Menu> map = new HashMap();
		 PrintMenu menu = new PrintMenu();
		 
 		//메뉴 객체 여러개 만들기
		//여러개의 객체를 관리할 변수
		 menu.setMenu(menuList);
		 System.out.println("----------------------------------");
		 menu.setMenu(stack);
		 System.out.println("----------------------------------");
		 menu.setMenu(map);
		 System.out.println("----------------------------------");
		 
		 
		//여러개의 객체 전부 다 출력
		menu.printAll(menuList);
		System.out.println("----------------------------------");
		menu.printAll(stack);
		System.out.println("----------------------------------");
		menu.printAll(map);
		System.out.println("----------------------------------");
		
		
		//여러개의 객체 전부 다 출력(name의 필드만 출력)
		menu.printSort(menuList);
		System.out.println("----------------------------------");
		menu.printSort(stack);
		menu.printSort(menuList);

	}
}
