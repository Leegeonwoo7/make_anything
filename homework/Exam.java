package homework;

import java.util.Scanner;

public class Exam {
	private final String JUNG = "11111";
	
	private String name;
	private String dap;
	private int score;
	private char[] ox = new char[JUNG.length()];
	
	public Exam() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		this.name = sc.next();
		System.out.print("답 입력: ");
		this.dap = sc.next();
		
		compare();
	}
	
	public void compare() {
		for(int i=0; i<JUNG.length(); i++) {
			if(dap.charAt(i) == JUNG.charAt(i)) {
				score += 20;
				ox[i] = 'O';
			}else {
				ox[i] = 'X';
			}
		}
	}
	
	public void printInfo() {
		System.out.print(name + "\t");
		for(int i=0; i<ox.length; i++) {
			System.out.print(ox[i] + " ");
		}
		System.out.println("\t" + score);
	}
}
