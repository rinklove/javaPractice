package main;

public class Menu {

	/**
	 * 버거 출력하는 메서드
	 * @return 입력받은 정수값
	 */
	public int printBurger() {
		System.out.println("==================");
		System.out.println("버거를 선택하세요");
		
		for(int i =0; i< Main.BURGER.length;i++) {
			System.out.println((i+1) + ". " +Main.BURGER[i]);			
		}
		return Main.sc.nextInt();
	}

	public int printSide() {
		System.out.println("==================");
		System.out.println("사이드를 선택하세요");
		
		for(int i =0; i< Main.SIDE.length;i++) {
			System.out.println((i+1) + ". " +Main.SIDE[i]);			
		}
		return Main.sc.nextInt();
	}
}
