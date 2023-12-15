package game.rcp;

import main.Main;

public class RcpGameManager {

	String[] choice = {"가위", "바위", "보"};
	public void startRcp() {
		String result = "";
		while(result.equals("") || result.equals("비겼습니다")) {
		System.out.println("가위, 바위, 보중에서 하나 입력하세요");
		String input = Main.scanUserInput();
		//컴퓨터 랜덤 선택
		String computer = comSelect();
		result = whoWin(input, computer);
		}
		System.out.println(result+"가 이겼습니다");
	}
	
	public String comSelect() {
		return choice[(int)(Math.random()*3)];
	}

	public String whoWin(String input, String com) {
		System.out.println("-------------------------------------");
		System.out.println("내가 낸 거: "+input);
		System.out.println("컴퓨터가 낸 거: "+com);
		System.out.println("-------------------------------------");
		if(input.equals(com)) return "비겼습니다";
		else {
			if((input.equals("가위") && com.equals("보")) ||
				(input.equals("보") && com.equals("주먹")) ||
				(input.equals("주먹") && com.equals("가위"))) {
				return "사용자";
			} else return "컴퓨터";
		}
	}
}
