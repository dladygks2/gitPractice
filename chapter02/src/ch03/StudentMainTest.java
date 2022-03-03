package ch03;

// 클래스를 사용하는 입장 쪽 코딩
public class StudentMainTest {

	public static void main(String[] args) {
		
		//2021-10-22 14:00
		//main 함수부터 코드가 해석하기 시작한다.
		//new 키워드 : 객체를 생성한다는 의미. ex) Student()라는 객체를 생성하겠다. 

		
		Student studentLee = new Student();
		
		studentLee.studentName = "이순신";
		studentLee.address = "인천";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanUp();
				
		Student studentKim = new Student();
		
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();

		// 메서드 사용
		// 1. takeTest 실행
		studentKim.takeTest();
		// 2. cleanUp 실행
		studentKim.cleanUp();
		
		
		
		System.out.println("====================");
		
		
		String name1 = studentKim.getStudentName();
		System.out.println("name1: " + name1);
		
		String name2 = studentLee.getStudentName();
		System.out.println("name2: " + name2);
		
		
		
	}	// end of main

}	// end of class
