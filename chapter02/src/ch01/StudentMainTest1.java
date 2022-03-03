package ch01;

// 설계된 학생 클래스를 사용해보는 입장.
public class StudentMainTest1 {
	
	// main 함수 (코드의 시작점)
	public static void main(String[] args) {
		
		Student s1;
		Student s2;
		
		// new 를 사용해야 메모리에 올라간다. heap영역에 올라간다. 그래야 인스턴스가 된다.
		
		s1 = new Student();
		s2 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		
		// s1,s2에 주소값이 담긴다.
		
		
	}	// end of main

}	// end of class
