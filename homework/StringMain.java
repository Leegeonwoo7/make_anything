package homework;

import java.util.Scanner;

public class StringMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("문자열 입력 : ");
		String input = sc.next().toLowerCase();
		System.out.print("현재 문자열 입력 : ");
		String serchStr = sc.next();
		System.out.print("바꿀 문자열 입력 : ");
		String replaceStr = sc.next();
		
		int index = input.indexOf(serchStr, 0);
		while(index != -1) {
		
		}
	}
}

//aaccaad
//bbccbbd
