package practice211027;

public class StudentTest3 {

	public static void main(String[] args) {
		
		Student3 studentLee = new Student3(10525, "이기태");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 80);

		Student3 studentKim = new Student3(10605, "김익상");
		studentKim.setKoreaSubject("국어", 95);
		studentKim.setMathSubject("수학", 75);
		
		Student3 studentSeok = new Student3(10525, "석탈해");
		studentSeok.setKoreaSubject("국어", 75);
		studentSeok.setMathSubject("수학", 100);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		studentSeok.showStudentScore();
	}
}
