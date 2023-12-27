package homework;

public class Subject {
	String subjectName;
	int score;
	
	public Subject(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}
	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}
	public Subject(int score) {
		this.score = score;
	}
	
	public String getName() {
		return subjectName;
	}
	public void setName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
