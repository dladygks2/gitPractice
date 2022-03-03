package ch05_14siBan;

import java.util.Scanner;

public class WhileMainTest4 {
	// main function
	public static void main(String[] args) {
		
		// 사용자가 0을 입력하면 프로그램을 종료시켜라
		// 사용자가 입력한 값을 계속 덧셈하는 프로그램으로 변경시켜라.
		
		// do - while 문 사용
		// 스캐너를 사용해서 사용자의 입력값을 받아서 덧셈 연산을 해주세요.
		// 연산의 결과를 화면에 출력하는 프로그램을 만들어주세요.
		
		System.out.println("입력 : ");
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int input;
		
		do { 			input = scanner.nextInt();
			sum += input;
			
		} while (input != 0);
		
		System.out.println("연산 결과 : " + sum);
		
		
//		for(int i = 0; i <3 ; i++) {
//			System.out.println("입력 : ");
//			input = scanner.nextInt();
//			sum+= input;
//		}
//		
		
		
	}	// end of main

} 	// end of class
