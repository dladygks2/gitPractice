package ch06;

// 클래스를 사용하는 입장
public class MainTest1 {
	
	// 메인함수(코드의 시작점)
	public static void main(String[] args) {


		Student studentLee = new Student(1,"Lee");	// Student생성자를 사용
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);

		studentLee.showStudentScore();
		System.out.println("====================");
		
		
		// 학생 2 동작 총점
		Student studentKim = new Student(2, "Kim");
		
		studentKim.setKoreaSubject("국어", 95);
		studentKim.setMathSubject("수학", 85);
		
		studentKim.showStudentScore();
		System.out.println("====================");
		
		
		// 학생 3 동작 총점
		
		Student studentPark = new Student(3, "park");
		
		studentPark.setKoreaSubject("국어", 75);
		studentPark.setMathSubject("수학", 100);

		studentPark.showStudentScore();
		System.out.println("====================");
		
			
	}	// end of main

}	// end of class
