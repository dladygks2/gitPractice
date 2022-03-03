package ch04;

public class Student {

	// 생성자 - constructor ( 객체를 만들 때 꼭 필요)
	// 객체를 생성할 때 다음과 같은 모양으로 만들어라고
	// 지시하는 것(강제성이 부여됨)

	// 멤버변수
	int number; // 학생의 번호
	String name; // 학생의 이름
	int grade; // 학생의 학년

	// 기본 생성자 (default constructor)
	// 사용자 정의 생성자가 없는 경우에는
	// 컴파일러가 알아서 기본 생성자를 만들어 준다.
	public Student() {

	}

	// 생성자 만들기(개발자가 직접 정의 - 사용자 정의 생성자)
	// 대부분은 public
	// 생성자 매개변수 안에 'grade'를 넣고 코드를 정상동작하게 수정하세요.
	public Student(int num, String name, int grade) { // 생성자는 class이름이랑 똑같이 해야함
		// 위 괄호 안에 객체 이름 넣을 수 있음
		number = num;
		// 매개변수 이름과 멤버변수 이름이 같다면 'this.' 키워드를 사용해서
		// 구분해 주어야 한다.
		this.name = name; // this. == 자기자신 을 의미
		this.grade = grade;
	}

	// 메서드 정의
	public void showInfo() {
		System.out.println(name + " 학생의 학번은 " + number + "번 입니다.");
		System.out.println(name + " 학생의 이름은 " + name + " 입니다.");
		System.out.println(name + " 학생의 학년은 " + grade + "학년 입니다.");
		System.out.println("========================");
//		System.out.println(name + " 학생의 학번은 " + number + "번 입니다.\n" 
//		+ name + " 학생의 이름은 " + name + " 입니다.\n" + name + 
//				" 학생의 학년은 " + grade + "학년 입니다.");
	}

}
