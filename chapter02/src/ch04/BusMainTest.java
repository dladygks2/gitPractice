package ch04;

import ch05.Student;

public class BusMainTest {
	
	public static void main(String[] args) {
		
		// 버스 101, 102 번 버스를 만들어 주세요.
		Bus bus101 = new Bus(101);
		Bus bus102 = new Bus(102);
		Bus bus103 = new Bus(103);
		
		
		
		Student student1 =new Student("홍길동", 10_000);
		Student student2 =new Student("홍길동", 10_000);
		// 
		bus101.showInfo();
		System.out.println("===============");
		bus102.showInfo();
		
		 
		//
		System.out.println("===============");
		bus101.take(1200);
		bus101.showInfo();
		
		
		// bus102 버스에 take 메서드를 2번 실행 후 showInfo 확인
		System.out.println("===============");
		bus102.take(1200);
		bus102.take(500);
		bus102.showInfo();
		
	}

}
