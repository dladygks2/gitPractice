package ch03_14siBan;

public class MainTest5 {
	// 메인함수
	public static void main(String[] args) {
		// 논리 연산자 (&&, ||)(엠퍼센트, 버티컬 바)(논리곱, 논리합)
		// 관계 연산자와 혼합하여 많이 사용됨
		// 연산의 결과가 true, false
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. 논리곱(&&)
		
		boolean flag1 = (num1 > 0 ) && (num2 > 0 );
		
		boolean flag2 = (num1 >0 ) && (num2<0);
		// 둘다 true(참)일 때, true를 반환한다.
		
		System.out.println(flag1);
		System.out.println(flag2);
		
		// 2. 논리합(||)
		
		boolean flag3 = (num1 < 0) || (num2>0);
		
		boolean flag4 = (num1 > 0) || (num2 > 0);
		// 둘 중에 하나라도 true이면, 연산의 결과는 true를 반환한다.
		
		System.out.println(flag3);
		System.out.println(flag4);

		System.out.println("---------------------------------");

		// num1 = 10
		// num2 = 20
		
		boolean flag5 = (num1 < 0 ) && (num2 > 0 );
		// num1 에서 이미 false 이므로 num2를 보지않고 바로 false 출력
		// short circuit evaluation 이라함
		
		boolean flag6 = (num1 > 0 ) || (num2 > 0 );
		// num1 이미 true 이므로 num2를 보지않고 바로 true 출력
		// 얘도 short circuit evaluation 이다.
		
		System.out.println("==================");
		
		
		
		
		
	}	// end of main

} // end of class
