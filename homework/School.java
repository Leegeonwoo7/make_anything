package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList = new ArrayList<>();
		
		System.out.print("인원수: ");
		int count = sc.nextInt();
		for(int i=0; i<count; i++) {
			Student student = new Student(sc.next());
			studentList.add(student);
		}
		
		System.out.print("과목수 ");
		int subjectCount = sc.nextInt();
		for(int i=0; i<subjectCount; i++) {
			System.out.print("과목명: ");
			String input = sc.next();
			Subject subject = new Subject(input);
		}
		
	}
}
