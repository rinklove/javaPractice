package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {

	List<Menu> list = new ArrayList<>();
	int totalPrice = 0;
	//일시작
	public void startWork() {
		
		prepareMenu();
		showMenu();
		order();
		pay();
	}
	//메뉴판 준비
	private void prepareMenu() {
		list.add(new Menu("김밥", 3000));
		list.add(new Menu("라면", 4500));
		list.add(new Menu("제육김밥", 5500));
		list.add(new Menu("민초김밥", 4000));
		list.add(new Menu("오렌지김밥", 4000));
		list.add(new Menu("크림김밥", 5000));
	}
	//메뉴판 보여주기
	private void showMenu() {
		for(Menu m : list) {
			System.out.println(m);
		}
	}
	
	//주문하기
	private void order() {
		System.out.println("메누를 선택하세오");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		try {
			totalPrice = list.get(Integer.parseInt(str)).getPrice();
		} catch (Exception e) {
			System.out.println("없는 메뉴를 고르셨습니다");
		}
	}
	
	//결제하기
	private void pay() {
		System.out.println("결제하실 금액은 " +totalPrice+"원 입니다.");
	}
}
