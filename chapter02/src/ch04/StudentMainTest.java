package ch04;

public class StudentMainTest {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {

		Student s1 = new Student(15, "홍길동", 3);

//		System.out.println(s1.number); 	// 멤버변수는 뒤에 ()없다.
//		System.out.println(s1.name); 	// 멤버변수는 뒤에 ()없다.
//		System.out.println(s1.grade); 	// 멤버변수는 뒤에 ()없다.

		s1.showInfo(); // 얘가 메서드이다. 메서드는 뒤에 ()있다.

		// 기본 생성자로 객체 생성해보기
		Student s2 = new Student();

		s2.number = 2;
		s2.name = "이순신";
		s2.grade = 2;

		System.out.println("번호 : " + s2.number);
		System.out.println("이름 : " + s2.name);
		System.out.println("학년 : " + s2.grade);

		s2.showInfo();
	} // end of main

} // end of class
//Ctrl Shif 'F' = 라인정렬