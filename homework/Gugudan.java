package homework;

public class Gugudan {
	    public static void main(String[] args) {
	        for (int i = 2; i <= 9; i += 3) {
	            for (int j = 1; j <= 9; j++) {
	                for (int k = 0; k < 3; k++) {
	                    int left = i + k;
	                    int right = left * j;

	                    System.out.print(left + "*" + j + "=" + right + "   ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }
	    }
	}
