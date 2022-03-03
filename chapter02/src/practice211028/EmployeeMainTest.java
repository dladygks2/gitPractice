package practice211028;

import ch09.Employee;

public class EmployeeMainTest {

	public static void main(String[] args) {
		
		int temp = Employee.getSerialNum();			// static ¸Þ¼­µå
		System.out.println(temp);
		
//		Day06_Ch09_Employee test1 = new Day06_Ch09_Employee();
//		test1.getEmployeeId();
		
		
		System.out.println("======================");
		Day06_Ch09_Employee employee1 = new Day06_Ch09_Employee();
		System.out.println(employee1.serialNum);
		System.out.println(employee1.getEmployeeId());
		System.out.println("======================S");
		Day06_Ch09_Employee employee2 = new Day06_Ch09_Employee();
		Day06_Ch09_Employee employee3 = new Day06_Ch09_Employee();
		Day06_Ch09_Employee employee4 = new Day06_Ch09_Employee();
		Day06_Ch09_Employee employee5 = new Day06_Ch09_Employee();
		
		System.out.println(employee5.getEmployeeId());
		System.out.println("=================");
		System.out.println(employee5.serialNum);
		System.out.println(employee5.serialNum);
		System.out.println(employee5.serialNum);
		System.out.println(employee5.serialNum);
		System.out.println(employee5.serialNum);
	}
}
