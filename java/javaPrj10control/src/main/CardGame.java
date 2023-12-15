package main;

import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//컴퓨터와 사용자에게 1~10까지 적혀있는 카드 제공
		int[] player = {1,2,3,4,5,6,7,8,9,10};
		int[]  com = {1,2,3,4,5,6,7,8,9,10};
		
		//컴퓨터와 사용자의 승점을 담는 변수
		int playerScore =0;
		int comScore =0;
		
		//라운드를 표시할 변수 초기화
		int round = 1;
		
		//사용자의 입력값을 받기 위한 Scanner 객체 도입
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========게임시작==========");
		while(round <=10 ) {
			System.out.println("======"+ round +"round======");
			System.out.println("이번 라운드에 낼 카드를 선택하세요");
			System.out.print("현재 있는 카드(0은 사용한 카드입니다): ");			
			for(int i =0; i<player.length; i++) {
				System.out.print(player[i]+ " ");
			}
			int playerChoice = sc.nextInt();
			
			if(player[playerChoice-1] == 0){
				System.out.println("이미 낸 카드입니다.  다시 입력하세요");
				continue;
			} else {
				player[playerChoice-1] = 0;	//내가 낸 카드를 표시하기 위한 장치
			}
			
			int comChoice = 0;
			//컴퓨터가 낼 숫자카드를 랜덤으로 선택, 단 중복되지 않게
			do {
				comChoice = com[(int)(Math.random()*10)];
			} while(comChoice == 0);
			
			//컴퓨터도 낸 값을 중복 사용할 수 없도록 선택한 카드의 값을 0 으로 바꿔주기
			com[comChoice-1]=0;
			
			System.out.println("내가 낸 카드: " + playerChoice + 
					" // 컴퓨터가 낸 카드: "+ comChoice);
			
			//카드 결과에 따라 사용자 또는 컴퓨터의 스코어를 처리함
			if(playerChoice <=10 && playerChoice > 0) { //--
				if(playerChoice > comChoice) {
					playerScore++;
					System.out.println("사용자 승!");
				} else if(playerChoice < comChoice) {
					comScore++;
					System.out.println("컴퓨터 승!");
				} else if(playerChoice == comChoice) {
					System.out.println("같은 카드를 내셨습니다. 아무도 승점을 얻지 못하셨습니다");
				} 
			}
			
			System.out.println("사용자와 컴퓨터의 현재 스코어 = " + playerScore + " : " + comScore);
			round++;
			System.out.println("");
			
 		} // 게임 종료
		//최종 결과 출력
		if(playerScore > comScore) {
			System.out.println(playerScore +" : " + comScore +"으로 사용자가 이겼습니다");
		} else if(playerScore < comScore) {
			System.out.println(playerScore +" : " + comScore +"으로 컴퓨터가 이겼습니다");
		} else {
			System.out.println(playerScore +" : " + comScore +"으로 비겼습니다");
		}
		System.out.println("=========게임종료==========");
	}

}
