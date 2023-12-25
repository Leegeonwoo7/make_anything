package school;

public class Score {
	private int studentId;
	private Subject subject;
	private int point;
	
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	//Score라는 객체가 point(점수)를 가지고있기때문에 Score에서 toString해주는?
	@Override
	public String toString() {
		return "학번: " + studentId + "," + subject.getSubjectName() + ":" + point;
	}
	
}
