package emp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import menu.Menu;

public class CounterEmp {
	
	private final Scanner sc = new Scanner(System.in);
	private List menuList = new ArrayList<>();

	private void showMenu() {
		//메뉴 준비
		 
		menuList.add(new Menu("아메리카노", 3000));
		menuList.add(new Menu("카페라뗴", 4000));
		menuList.add(new Menu("청포도에이드", 5000));
		menuList.add(new Menu("달고나라뗴", 3000));
		menuList.add(new Menu("밀크쉐이크", 3000));
		
		printList(menuList);
	}
	//메뉴판 출력
	private void printList(List<Menu> menuList) {
		for(int i =0; i<menuList.size(); i++) {
			System.out.println((i+1)+ ": "+menuList.get(i).getName()+
					"(" +menuList.get(i).getPrice() +"원)");
		}
	}
	//메뉴 입력 받기
	public void work() {

		//메뉴 보여주기
		showMenu();
		//메뉴 입력받기
		System.out.print("메뉴를 선택하세요");
		int menuNum = scanUserInput();
		printMenu(menuNum);
		 //개수 입력받기
		System.out.print("수량을 입력하세요");
		 int menuCount = scanUserInput();
		 
		//결제 금액
		 int totalPrice = getMenuPrice(menuNum) * menuCount;
		 System.out.println("결제 금액: "+totalPrice);
	}
	
	private int getMenuPrice(int n) {
		return ((Menu) menuList.get(n-1)).getPrice();
	}
	private void printMenu(int num) {
		Menu result = ((Menu)menuList.get(num-1));
		System.out.println("메뉴 이름: "+result.getName());
		System.out.println("메뉴 가격: "+result.getPrice());
	}
	private int scanUserInput() {
		// nextInt()가 있는데 왜 이렇게 하는지
 		return Integer.parseInt(sc.nextLine());
	}
	
			
	//결제
}
