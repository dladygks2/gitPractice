package ch01;
// 주 파일을 모아두는 파일을 패키지라고 한다..

public class DataType1 {

	// 메인함수(코드의 시작점)
	public static void main(String[] args) {
		// 데이터 타입 종류
		// 1. 기본 자료형(primitive data type)
		// 2. 참조 타입(Reference Type)

		// 기본 자료형
		// 정수형 문자형 실수형 논리형(4가지 존재)

		// 정수형(1,10,100)

		byte b; // 1바이트 = 8bits(0~127)
		short s; // 2바이트 = 16비트, 거의 사용안함
		int i; // ** 4바이트 = 32비트, 주로 사용
		long l; // 8바이트 = 64비트, 주로 사용

		b = 127;
		// b = 128;
		b = -128;
		// byte 의 범위 : -128~127

		// int 의 수의 표현 범위
		i = 2100000000;
		i = -2100000000;
		// i = 22000000000;

		l = 22000000000l;
		l = 22000000000L;
		// 소문자 l 이나 대문자 L 을 접미사로 사용해서 long 임을 명시한다. 가능한 대문자 L로 쓰자

		i = 10;
		System.out.println(i);

		i = 300;
		System.out.println(i);

			// Ctrl + shift + 'F'key : 라인 정렬 기능
	}// end of main

} // end of class
