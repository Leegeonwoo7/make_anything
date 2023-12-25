package school;

import java.util.ArrayList;
//깃 파일 삭제하고 git init까지했음 이어서 리모트하면 됨
public class Student {
	private int studentId;
	private String studentName;
	private Subject majorSubject;
	private ArrayList<Score> scoreList = new ArrayList<>(); //Student라는 객체안에 학생의 점수를 갖고있는 것이기때문에 인스턴스변수로 생성해주면됨(생성자에서 X)
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject major) {
		this.majorSubject = major;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
}
