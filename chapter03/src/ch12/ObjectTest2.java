package ch12;


class Student1 extends Object{
	
	// toString(); 이미 정의되어 있다. extends Object 에다가
	
	@Override//(재정의)
	public String toString() {
		// TODO Auto-generated method stub
		return "학생 클래스";
	}
	
}



public class ObjectTest2 extends Object {
	
	String str1;
	
	
	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		System.out.println(s1);
		
		String str1 = new String("안녕하세요");
		System.out.println(str1);
		
	}
}
