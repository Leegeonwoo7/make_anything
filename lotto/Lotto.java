package lotto;

public class Lotto {

	public static void main(String[] args) {
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
	
	}
}
