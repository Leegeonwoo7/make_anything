package homework;

import java.util.Scanner;

public class RSP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String betting;
		int choice, money = 1000;
		
		while(!(money <= 0)) {
			System.out.println("배팅금액을 입력하세요: (그만하시려면 Q를 입력하세요)" );
			betting = sc.next();
			if(betting.equalsIgnoreCase("q")) break;
			if(Integer.parseInt(betting) > money) {
				System.out.println("배팅금액이 보유머니보다 많습니다.");
				continue;
			}
			
			do {
				System.out.print("가위(1) 바위(2) 보(3) 입력: ");
				choice = sc.nextInt();
				if(choice < 1 || choice > 3) {
					System.out.println("1(가위), 2(바위), 3(보) 중에 선택하셔야합니다.");
				}
			}while(choice < 1 || choice > 3);
			
			
			int computer = (int)(Math.random() * 3 + 1);
			
			if(choice == computer) {
				System.out.println("무승부");
				money -= Integer.parseInt(betting);
			}else if((choice == 1 && computer == 3) || (choice == 2 && computer == 1) || (choice == 3 && computer == 2)) {
				System.out.println("승리");
				money += Integer.parseInt(betting) * 2;
			}else {
				System.out.println("패배");
				money -= Integer.parseInt(betting);
			}
			
			System.out.println("남은 COIN: " + money + "\n");
			
			}
		System.out.println("가지고 있는 돈: " + money);
	}
}
