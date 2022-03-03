package practice211028;

public class Day04_StudentMainTest2 {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		// Student 클래스를 이용하는 student1이라는 객체를 만들것이다.
		// new 메소드로 메모리에 자리를 만들것이다. 
		// 그 자리는 Student클래스를 사용하는 애이다.
		
		/*1. 접근해서 name,height, weight,  grade
		 * 값을 줘서 화면에 출력해주세요. 
		 */
		
		student1.height = 174.5;
		student1.weight = 74;
		student1.grade = 5;
		student1.name = "홍길동";
		
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		System.out.println(student1.name);
		System.out.println("============");
		
		
		Student student2 = new Student();
		
	}
}
