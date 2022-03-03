package ch05_14siBan;

public class WhileMainTest3 {
	// main function
	public static void main(String[] args) {
		
		// do ~ while
		int input = 10;
		int sum = 0;
		
		do {
			
			System.out.println("현재 값:" + input);
			// 식을 만들어 봅시다.
			
			sum += input;
			
			input--;		// '감소 연잔자' 라고한다.
			
		} while(input != 0);
		
		System.out.println("연산의 결과는 : " + sum + "입니다.");
	}	// end of main

}	// end of class
