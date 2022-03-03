package ch12;

// 많이 사용하는 기본 클래스들이 속한 패키지
import java.lang.*;

class Student extends Object{
	
	// toString();
	// override : 재정의 , ctrl + space 로 override를 찾아???
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "학생클래스";
	}
	
	
}





public class ObjectTest extends Object {

	// Object 는 상속하지 않더라도 기본적으로 가지고 오는 클래스이다.
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1);
		
		String str1 = new String("안녕하세요.");
		System.out.println(str1);
		
		
	}		// end of main
}
