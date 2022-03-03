package practice211027;

public class StudentMainTest {

	public static void main(String[] args) {
		
		// Student 클래스를 사용하겠다. 변수이름 studentLee
		// new 로 Student();의 메모리를 할당하겠다. 위치를 새로 선정하겠다.
		Student1 studentLee = new Student1();
		// Student 클래스에 정의된 변수 studentName, address를 정하겠다.
		
		// Student 클래스의 기능들을 꺼내서 사용
		studentLee.studentName = "이순신";
		studentLee.address = "서울";
		
		studentLee.showStudentInfo();
		
		// studentLee가 저장된 메모리값
		System.out.println(studentLee);
		
		// 얘는 대입만 한거네
		Student2 studentKim = new Student2(31023, "김두식", 3);
		
		// 얘는 return 값인데, 주소값을 리턴한건가
		String data = studentKim.showStudentInfo();
		System.out.println(data);
		System.out.println(studentKim);
		System.out.println(studentKim.showStudentInfo());
		
		
		
		
		
		
		
	}
}
