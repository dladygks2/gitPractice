package ch05_14siBan;

import java.util.Scanner;

public class IFMainTest {
	// main
	public static void main(String[] args) {
		// 제어문 if
		// 주어진 조건에 따라서 실행이 이루어 지도록 구현
		// 만약 ... 이라면

		boolean flag = false;

		// if 문 단독
		if (flag) {
			System.out.println("조건식이  True 이면 실행 됩니다.");
		} // end of if

		// if else문: 둘 중 하나는 반드시 실행됨
		if (flag) {
			System.out.println("True 실행");
		} else {
			System.out.println("False 실행");
		} // end if if-else
System.out.println("========================");
		// if-else if-else
		Scanner sc=new Scanner(System.in);
		int point=sc.nextInt();
		
		if (point >= 90) {
			
			System.out.println("A학점");
			
		} else if (point >= 80) {
			
			System.out.println("B학점");
			
		} else if (point >= 70) {
			
			System.out.println("C학점");
			
		} else if (point >= 60) {
			
			System.out.println("D학점");
			
		} else {
			
			System.out.println("낙제");
			
		}

	} // end of main

}// end of class
