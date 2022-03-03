package practice211027;

public class Student3 {

	int studentID;
	String studentName;
	
	Subject3 korea;
	Subject3 math;
	
	public Student3(int id, String name) {
		studentID = id ;
		studentName = name;
		
		korea = new  Subject3();
		math = new  Subject3();
	}
	
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + " 점 입니다.");
	}
	
	
}
