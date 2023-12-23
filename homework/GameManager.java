package homework;

import java.util.Scanner;

public class GameManager {
	private Player player;
	private Scanner sc;
	
	public GameManager() {
		this.player = new Player(1000);
		this.sc = new Scanner(System.in);
	}
	
	public void playGame() {
		String betting;
		int choice;
		
		while(player.getMoney() > 0) {
			System.out.println("배팅 금액을 입력하세요: (그만하시려면 Q를 입력하세요)");
			betting = sc.next();
			
			if(betting.equalsIgnoreCase("q")) {
				break;
			}
			
			if(Integer.parseInt(betting) > player.getMoney()) {
				System.out.println("배팅금액이 보유머니보다 클 수 업습니다.");
				continue;
			}
			
			do {
				System.out.println("가위(1) 바위(2) 보(3) 입력: ");
				choice = sc.nextInt();
				if(choice < 1 || choice > 3) {
					System.out.println("1~3중에 선택하셔야 합니다.");
				}
			}while(choice < 1 || choice > 3);
			
			int computer = (int)(Math.random() * 3 + 1);
			//비교메서드
		}
	}
	
	public void compare(int computer, int user, int betAmount) {
		if(computer == user) {
			System.out.println("무승부");
			player.updateMoney(-betAmount);
		}else if((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
			System.out.println("승리");
			player.updateMoney(betAmount * 2);
		}else {
			System.out.println("패배");
			player.updateMoney(-betAmount);
		}
	}
}
