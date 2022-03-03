package ch05;

public class DownCastingTest {
	
	public static void main(String[] args) {
		
		// 1. 바나나에 origin 멤버 변수를 추가
		
		Fruits fruit = new Banana();		// 업 캐스팅 상태
		
		// 다운 캐스팅을 위해 알아야 하는 개념;
		
		// 컴파일러는 부모타입 인스턴스 변수 타입을 
		// 바라보고 있는 상태이다.
		
		// 다운 캐스팅을 사용한다면 가능
		// (컴파일러에게 자식 객체 타입으로 바라 보라고 명시하는 것)
		String origin = ((Banana)fruit).origin;
		System.out.println("원산지 : "+ origin);
		
		
		
		
		
		// 컴파일 타임
		//	: 사람이 작성한 코드를 기계어로 변환시키는 시점
		
		
		// 런타임
		// : 프로그램을 실행하는 시점
	}	// end of main

}	// end of class 
