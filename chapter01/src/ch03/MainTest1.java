package ch03;

public class MainTest1 {
	//메인함수(코드의 시작점)
	public static void main(String[] args) {

		//논리연산자(&&, ||) 엠퍼센트. 버티컬 바
		//관계 연산자와 혼합하여 많이 사용한다
		//연산의 결과가 true, false 
		
		int num1 = 10;
		int num2 = 20;
		
		//1. 논리 곱            true      &&      true -> 둘 다 True = True
		boolean flag1 = (num1>0)&&(num2>0);
		System.out.println(flag1);
		
		boolean flag2 = (num1>0)&&(num2<0);
		System.out.println(flag2);
		
		//2. 논리 합  -> 둘 중 하나만 True = True
		boolean flag3 = (num1<0)||(num2>0);
		System.out.println(flag3);
		
		boolean flag4 = (num1<0)||(num2<0);
		System.out.println(flag4);
		
		//3. 부정
		boolean flag5=!(true);
		System.out.println(flag5);
		
		//
		
	}// end of main
}// end of class
