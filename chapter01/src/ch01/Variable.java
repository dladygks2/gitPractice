package ch01;

public class Variable {

	public static void main(String[] args) {
		
		// 변수를 사용하는 방법
		int age; 		// 변수의 선언
		int count;	 //변수의 선언
		
		// 초기화, 값을 넣는다. 값을 지정하는 것을 '초기화'라 한다.
		age = 20;
		count = 500;

		// 변수의 선언, 초기화를 동시에
		int age2 = 90;
		int count2 = 88;
		
		// 변수의 이름을 만들 때 규칙
		// 1. 대소문자가 구별되며 길이에 제한이 없다.
		int name = 100;
		int Name = 101; // 단, 변수명을 처음부터 대문자로 표기 하지 않습니다. 
		// 2. 자바에서 사용하는 예약어는 사용할 수 없다.
		// int, while, for, if 
//(Ctrl + /)= 그 줄 주석		int while;
//		int for;
		
		// 3. 변수는 숫자로 시작할 수 없다.
//		int 9name;
//		int 55age;
		
		int na6me;
		int name9;
		
		// 4. 특수문자는 _, $ 만 사용가능 하다.
		int _age;
		int $name;
		int age_;
		int na$me;
		System.out.println("------------------------");
		int id =101;
		// 1. int  <--- 데이터 자료형
		// 2. id <--- 변수 
		// 3. 101 <--- 값, 리터럴(literal), 프로그램에서 부르는 '상수'
		
	//	byte a = 128;
		byte b = 127;
		byte c = -128;
		
		
		
		
		
		
	}

}
