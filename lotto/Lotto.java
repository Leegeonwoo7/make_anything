package lotto;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = 0;
		while(true) {
			System.out.println("구매하실 금액을 입력해주세요: ");
			amount = sc.nextInt();
			if(amount % 1000 == 0) {
				break;
			}
		}
		
		for(int count = 0; count<amount/1000; count++) {
		
			int[] lotto = new int[6];
			
			for(int i=0; i<lotto.length; i++) {
				int random = (int)(Math.random() * 45 + 1);
				lotto[i] = random;
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
			for (int i = 0; i < lotto.length - 1; i++) {
			    int minIndex = i;
			    for (int j = i + 1; j < lotto.length; j++) {
			        if (lotto[j] < lotto[minIndex]) {
			            minIndex = j;
			        }
			    }
			    int tmp = lotto[i];
			    lotto[i] = lotto[minIndex];
			    lotto[minIndex] = tmp;
			}
		
			for(int i=0; i<lotto.length;i++) {
				System.out.print(lotto[i] + "\t");
			}
			System.out.println();
			if((count+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
