package ch02_14siBan;

public class ConstantTest {

	
	// 메인함수(코드의 시작점)
	public static void main(String[] args) {
		
		
		// 상수(constant)
		final int MAX_NUM = 12; // 상수를 선언과 초기화를 동시에
		final int MIN_NUM;			// 상수 선언
		// final float, char 이런것도 된다.
		MIN_NUM = 1;

		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM =100;
//		'Ctrl' + '/' : 그 줄 주석
//		상수에 한 번 초기화 된 공간에는 값을 변경할 수 없다. 한번 값이 들어가면 변경 불가하다.
		//1	2	3(상수)			4
		final int MY_COUNT = 100;
		
		//1. 위에서 상수는 어디를 말하는걸까요? 변수는 대문자를 쓰지 않는다... 
		// MY_COUNT 가 상수구나...
		
		//2. 예약어는 어디어디를 말하는 걸까요???
		// 예약어 : JAVA에서 미리 의미를 지정한 단어들 , 1.final, 2. int 가 답이다.

		//3. '100'  = 값 = 리터럴(literal)
				
	}// end of main

} // end of class
