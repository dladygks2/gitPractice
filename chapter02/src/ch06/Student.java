package ch06;

public class Student {

	int studentID;
	String studentName;
	
	// 우리가 설계한 클래스를 참조 타입으로 사용한다. 
	
	Subject korea;
	Subject math;
	
	// 생성자 : 이 객체를 메모리에 올릴때 처음 실행되는 영역
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		// ??? korea, math 자료들을 담을 메모리를 생성해야한다.
		// 참조타입은 new 키워드를 사용해야함
		// 참조 타입은 생성을 해야 사용할 수 있다. 메모리에 존재하도록 new 키워드가 필요하다.
		korea = new Subject();
		math = new Subject();
	}
	
	// 정보를 입력받는 메서드 생성(국어 과목에 대한 정보세팅)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// 정보를 입력받는 메서드 생성(수학 과목에 대한 정보세팅)
		public void setMathSubject(String name, int score) {
			math.subjectName = name;
			math.score = score;
		}
		
	// 국어와 수학의 평균점수를 내는 기능. 학생의 총점을 화면에 출력하는 기능 만들기
		public void showStudentScore() {
			int total = korea.score + math.score;
			System.out.println(studentName + " 학생의 총점은 " + total +"점 입니다." );
		}
		
		/*
		 * 데이터를 담을 때 먼저 어떤 데이터인지 종류를 정해줘야한다.
		 * 
		 * 참조 자료형: 개발자가 스스로 OOP 개념으로 만들어 낼 수 있다. JDK에서 제공하는 것을 사용할 수도 있다. 
		 * 예) String 등
		 * 
		 * 외부 라이브러리도 사용
		 * 
		 * 자바에서는 첫글자의 대소문자 구분을 한다. 기본자료형 : 소문자 // 참조 자료형 : 대문자
		 * 
		 * 기본 자료형은 사용하는 메모리의 크기가 정해져 있지만, 참조 자료형은 클래스에 따라 다름
		 * 
		 * 참조 자료형을 사용 할때는 해당 변수에 대해 생성하여야 함.... 
		 * ex) new (String 클래스는 예외적으로 생성하지 않고 사용할 수 있다.)
		 * 
		 * 예 ) String name = "A"; Warrior warriorA = new Warrior();
		 */

}
