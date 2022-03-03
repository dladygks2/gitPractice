package ch03_14siBan;

public class MainTest3 {
	//메인함수
	public static void main(String[] args) {
		
		// 증감, 감소 연산자
		// ++, --
		
		int num1 = 1;
		num1++;
		
		System.out.println(num1);
				
		int num2 = 1;
		num2--;
		System.out.println(num2);

		
		
		// 1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		num4 = num3++; // 연산의 결과는 ;의 다음부터 적용된다.
		//num4 = ++ num3;
		
		// 처음 습관은 'num4 = num3++;' 형식으로 쓰란다.
		
		System.out.println("num4는 : " + num4);
		System.out.println("num3은 : " + num3);
		
		int num5 = 100;
		int num6;
		
		// 1. num5를 num6 변수에 담아주세요.
		// 단, 증감 연산자를 사용해서 num6 변수를 101로 만들어서 출력해주세요
		
		num6 = ++num5;
		System.out.println(num6);
		
		// 2. num5를 num6 변수에 담아 주세요.
		// 단, 증감 연산자를 사용해서 num6 변수를 101로 만들어서 출력
		
		num6= num5++;
		System.out.println(num6);
		System.out.println(num5);
		
		// 결론 : 증감 연ㅅ나자는 변수(공간)에 있는 값을 1 증가 시킨다.
		// 단 앞에 있을 때와 뒤에 있을 때 연산의 순서가 다르다.
		
				
	}	//end of main

}	// end of class
