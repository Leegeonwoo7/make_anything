package string;

import java.util.Scanner;

public class BufferMain {
	private int dan;

	public BufferMain() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력: ");
		dan = sc.nextInt();
	}

	public void display() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 1; i <= 9; i++) {
			buffer.append(dan);
			buffer.append(" * ");
			buffer.append(i);
			buffer.append(" = ");
			buffer.append(dan * i);
			System.out.println(buffer);
			buffer.delete(0, buffer.length());
		}
	}

	public static void main(String[] args) {
		BufferMain bm = new BufferMain();
		
		bm.display();
	}
}