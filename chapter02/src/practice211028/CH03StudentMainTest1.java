package practice211028;

public class CH03StudentMainTest1 {

	public static void main(String[] args) {
		
		CH03Student studentLee = new CH03Student();
		studentLee.studentID = 31025;
		studentLee.studentName = "이천수";
		studentLee.address = "서울 중랑구";
		
		studentLee.showStudentInfo();
		
		CH03Student studentKim = new CH03Student();
		studentKim.studentID = 31010;
		studentKim.studentName = "김사랑";
		studentKim.address = "서울 마포구";
		
		studentKim.showStudentInfo();
		
		System.out.println("---------------------------------");
		
		String name1 = studentLee.getStudentName();
		System.out.println("학생 이름 : " + name1);
		

		String name2 = studentKim.getStudentName();
		System.out.println("학생 이름 : " + name2);
		
		
		
	}
}
