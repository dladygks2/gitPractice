package practice211027;

public class Student2 {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student2(int studentNumber, String studentName, int grade) {
		this.studentName = studentName;
		this.studentNumber  = studentNumber;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		return studentName + " 학생의 학번은 " + 
				studentNumber + "이고, " + grade + " 학년 입니다.";
	}

}
