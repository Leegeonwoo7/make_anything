package homework;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 입력: ");
		int count = sc.nextInt();
		Exam exam[] = new Exam[count];
		
		for(int i=0; i<count; i++) {
			exam[i] = new Exam();
		}
		
		System.out.println("이름\t1 2 3 4 5\t점수");
		for(int i=0; i<exam.length; i++) {
			exam[i].printInfo();
		}
	}

}
