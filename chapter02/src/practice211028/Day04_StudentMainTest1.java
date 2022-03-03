package practice211028;

public class Day04_StudentMainTest1 {

	public static void main(String[] args) {
/*
 * 클래스란 패키지를 만들기 전의 설계도면이다.
 * Student.java 클래스에서 Student에 대해서 정의했다
 * String name;
 * double height;
 * int weight;
 * int grade;
 * 
 * Student s1; 
 * : s1은 Student 클래스를 사용할 것이다는 뜻?
 * 
 * new() 하면은 메모리에 공간을 만드는 것이다. 
 * 그래서 프린트하면 s1의 메모리값이 나온다.
 * 
 * 그러니까 s1,s2는 그냥 방 같은 느낌인건가?
 * Student클래스를 이용할 수 있는 방?
 */
		Student s1;
		Student s2;
		
		s1 = new Student();
		s2 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
