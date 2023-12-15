package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isWin="";
		String reply;
		int userWin = 0;
		int comWin = 0;
		System.out.println("======게임시작======");
		while(userWin < 3 || comWin < 3) {
			//배열을 쓰지않고?
//			String[] choice = {"가위", "바위", "보"};
			String com ="";
			
			int choice =(int) (Math.random() *3);
			
			switch(choice) {
				case 1: com="가위"; break;
				case 2: com="바위"; break;
				default: com ="보"; break;
			}
			
//			if(choice == 0) {
//			} else if(choice == 1) {
//				com = "가위";
//			} else {
//				com ="보";
//			}
		
			//사용자에게서 입력값을 받기 위해 Scanner 객체 생성
			Scanner sc = new Scanner(System.in);
			System.out.println("가위, 바위, 보중 하나를 입력하세요");
			String user = sc.nextLine();
			System.out.println("사용자: " + user);
		
			//컴퓨터는 가위 바위 보 중에서 하나의 랜덤한 데이터 선택
//			String com = choice[(int) (Math.random() * choice.length)]; => 배열 사용할 경우8vkf7
			
			System.out.println("컴퓨터: " + com);
			
			//문자열 비교는 equals() 사용
			if(user.equals("가위") && com.equals("보") 
				|| user.equals("보") && com.equals("바위")
				|| user.equals("바위") && com.equals("가위")
				|| user.equals("이준호")) {
				//사용자가 이겼을 때
				isWin = "이겼";
				userWin++;

			} else if(user.equals("가위") && com.equals("바위") 
				|| user.equals("보") && com.equals("가위")
				|| user.equals("바위") && com.equals("보")) {
				//사용자가 졌을 때
				isWin = "졌";
				comWin++;
				
			} else if(user.equals(com)) {
				//비겼을 때
				System.out.println("비겼습니다");
			} else {
				//잘못 입력했을 때
				System.out.println("잘못 입력하셨습니다. 가위, 바위, 보 중에서 하나만 입력하세요");
			}
			//각 라운드마다 스코어 출력
			System.out.println("사용자 대 컴퓨터 스코어= "+userWin +" : "+ comWin);
			
			//결과가 나오고 재시작 여부를 물음.
			if(userWin == 3 || comWin == 3) {
				System.out.println(userWin +" : " +comWin+"으로 사용자가 " +isWin+"습니다");
				System.out.println("다시 하시겠습니까? 재경기를 희망하면 y를 눌러주세요");
				Scanner sc2 = new Scanner(System.in);
				reply = sc2.nextLine();
				if(reply.equals("y")) {
					userWin = 0;
					comWin =0;
				}else {
					break;
				}
			}
		}
		System.out.println("======게임종료======");
	}
	
}
