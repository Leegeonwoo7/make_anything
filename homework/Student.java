package homework;

import java.util.ArrayList;

public class Student {
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	
	
}
