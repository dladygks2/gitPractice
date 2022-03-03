package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {

		int temp = Employee.getSerialNum(); // static 메서드
		System.out.println("temp의 시리얼 넘버 : " + temp);

//		Employee test1;
//		test1.getEmployeeId(); // <--- 일반 메서드이다.
// 		new Employee(); 이거 만들때 마다 serialNum이 1씩 증가하고
//		employId에 대입된다.
		
		
		// Employee()를 생성하면 serialNum++가 실행된다.
		// test2의 멤버변수에 serialNum++해서 입력되는건가보다.
		
		Employee test2 = new Employee();
		int t2 = test2.getEmployeeId();
		System.out.println("test2의 EmployeeID : " + t2);
		
		Employee employee1 = new Employee();
		System.out.println("employee1의 시리얼 넘버 : " + employee1.serialNum);

		// Employee의 private 변수를 사용하고자 할때
		// private 변수는 같은 클래스에서만 사용가능?
		// get() ,set() 메서드 사용

		System.out.println(employee1.getEmployeeId());

		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();

		System.out.println(employee5.getEmployeeId());

		// 멤버변수와 스태틱변수는 다르다...
		// static 은 공통으로 접근할 수 있는 변수
		System.out.println(employee5.serialNum);
		System.out.println(employee1.serialNum);
		System.out.println(employee2.serialNum);
		System.out.println(employee3.serialNum);

		// static 변수, 멤버 변수, 지역 변수, ---> 메모리 위치 확인해서 다른 애들임을 인식해라

		System.out.println("==========");

		// emplyee1 ~5 : 인스턴스 변수로 접근해서 getSerialNum() 실행

//		employee1.getSerialNum();

		System.out.println(employee1.getSerialNum());
		System.out.println(employee2.getSerialNum());
		System.out.println(employee3.getSerialNum());
		System.out.println(employee4.getSerialNum());
		System.out.println(employee5.getSerialNum());
		System.out.println("=========");

		// 클래스 이름으로 접근해서 getSerialNum() 메서드를 사용
		// 이거는 static으로 공통으로 생성된 부분이라 1006으로만 나오는 것
		
		Employee.getSerialNum();

		System.out.println(Employee.getSerialNum());

	} // end of main

} // end of class
