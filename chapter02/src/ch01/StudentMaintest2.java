package ch01;

public class StudentMaintest2 {

	public static void main(String[] args) {

		Student student1 = new Student();
		// 1. 접근해서 name, height, weight, grade
		// 원하는 값을 넣고 화면에 출력
		
		student1.name = "홍길동";
		student1.height = 150;
		student1.weight = 50;
		student1.grade = 'A';
		
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		
		
		System.out.println("------------------");
		
		Student student2 = new Student();
		// 2. 접근해서 name, height, weight, grade
		// 원하는 값을 넣고 화면에 출력
		
		student2.name = "김갑한";
		student2.height = 145;
		student2.weight = 34;
		student2.grade = 'C';
				
		System.out.println(student2.name);
		System.out.println(student2.height);
		System.out.println(student2.weight);
		System.out.println(student2.grade);
		
		
	}	// end of main

}	// end of class
