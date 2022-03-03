package ch01;

public class ArrayMainTest {
	// void = return이 필요... 없지않나
	public static void main(String[] args) {

		/*
		 * 배열(array) 연관된 데이터를 모아서 통으로 관리하기 위해서 사용하는 데이터 타입
		 * 
		 * 변수가 하나의 데이터를 저장하기 위한 것이라면 
		 * 배열은 여러 개의 데이터를 하나의 변수에 저장하기 위한 것이라고 할 수 있다.
		 * 
		 * ● 동일한 자료형의 순차적 자료 구조 
		 * ● 인덱스 연산자[]를 이용하여 빠른 참조가 가능 
		 * ● 물리적 위치와 논리적 위치가 동일 
		 * ● 배열의 순서는 0부터 시작 
		 * ● 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
		 * 
		 */
		int number = 10;

		// 배열 선언 방법
		// 1
		int[] arr1 = new int[3]; // [3] : 3칸을 만들 것이다. 0~2

		// 2
		int arr2[] = new int[10]; // [789] : 마지막 인덱스는 '788'이다.

		/////////////////////
		// 값을 대입하는 방법, 초기화 하는 방법
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;

		// index 값 = n-1

		// 배열의 선언과 동시에 초기화
		int[] numbers1 = new int[] { 11, 20, 30 };
		int[] numbers2 = { 10, 50, 100 };

		// 출력 방법
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);

		// crud : create / r /u /delete ???

		System.out.println(numbers1);

		//
		String[] strArr1 = new String[10];
		strArr1[0] = "야스오";
		strArr1[1] = "티모";
		strArr1[2] = "애쉬";
		strArr1[3] = "다리우스";

		// 1. 화면에 0,1,2,3 출력해주세요. 단 for문 사용금지
		System.out.println(strArr1[0]);
		System.out.println(strArr1[1]);
		System.out.println(strArr1[2]);
		System.out.println(strArr1[3]);

		System.out.println(strArr1.length);

		// 코드 수정 null 값을 출력하지 마세요
		for (int i = 0; i < strArr1.length; i++) {
			if (strArr1[i] != null) {
				System.out.println(i + " 인덱스에 " + strArr1[i]);
			} // end of if

//				else{
//				System.out.println(i + "인덱스에 입력된 값이 없습니다.");
//				}

		} // end of for

		/*
		 * 모든 프로그램 언어에서는 index는 0부터 시작합니다. 배열을 사용할 때 보통 for문과 관계해서 많이 사용합니다.
		 */
//		new int[22]; // 길이 = 22, index = 21
//		new int[74]; // 길이 = 74, index = 73
//		new int[283]; // 길이 = 283, index = 282

	}// end of main

}// end of class