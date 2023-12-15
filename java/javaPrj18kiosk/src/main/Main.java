package main;

import java.util.Scanner;

public class Main {
	
	//아래 변수는 동일한 값을 유지함 => final을 통해서 변수를 상수로
	static final String[] BURGER = {"상하이 스파이시", "베이컨 토마토 디럭스", "슈비버거"};
	static final String[] SIDE = {"감자튀김", "치즈스틱", "코울슬로"};
	static final String[] DRINK = {"콜라", "사이다", "환타"};
	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu menu = new Menu();
		
		String burgerName = "";
		String sideName = "";
		String drinkName = "";
		//맥도날드 키오스크 프로그램
		System.out.println("주문하시겠습니까?");
		
		//here or to go?
		System.out.println("1. 포장 2. 매장");
		int packageType = sc.nextInt();
		//메뉴 선택 (버거, 사이드, 음료)
//		System.out.println("==================");
//		System.out.println("버거를 선택하세요");
//		System.out.println("1." +BURGER[0]);
//		System.out.println("2." +BURGER[1]);
//		System.out.println("3." +BURGER[2]);
		burgerName = BURGER[menu.printBurger()-1];
		
//		System.out.println("==================");
//		System.out.println("사이드를 선택하세요");
//		System.out.println("1." +SIDE[0]);
//		System.out.println("2." +SIDE[1]);
//		System.out.println("3." +SIDE[2]);
//		int selectSide =sc.nextInt();
		sideName = SIDE[menu.printSide()-1];
		System.out.println("==================");
		System.out.println("음료를 선택하세요");
		System.out.println("1." +DRINK[0]);
		System.out.println("2." +DRINK[1]);
		System.out.println("3." +DRINK[2]);
		int selectDrink = sc.nextInt();
		
		
		switch(selectDrink) {
		case 1: drinkName = DRINK[0]; break;
		case 2: drinkName = DRINK[1]; break;
		case 3: drinkName = DRINK[2]; break;
		default: System.out.println("잘못입력하셨습니다"); break; 
		}
		
		System.out.print("햄버거: " + burgerName);
		System.out.print("// 사이드: " + sideName);
		System.out.println("// 음료수: " + drinkName);
		System.out.println("를 " +packageType +"주문하셨습니다");
		//결제 
		
		//대기번호 출력
	}

}
