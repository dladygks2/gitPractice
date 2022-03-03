package ch01;

public class DataType3 {
	
	public static void main(String[] args) {
		// 기본 자료형 - 실수형 (1.0, 0.123, 0.001)
		
		// float, double
		// 변수의 선언과 초기화를 동시에 
		float name = 0.5F;	// 실수형은 double이 기본타입, 접미사를 사용해야함
		
		// double은 8바이트 -> 소수점을 많이 표시할 수 있기 때문에 정확성을 더 보장하기 때문에
		// 소수점을 표현할 때에는 double을 사용하는 것이 좋다. 
		double name2 = 0.123; 
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println("=============");
		System.out.println(0.5F);
		System.out.println(0.12345);		// 변수에 담기지 않았으니 한번쓰고 끝
		
		
		
		
		
	}
}
