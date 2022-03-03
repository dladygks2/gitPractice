package ch03_14siBan;

import java.util.Scanner;

public class MainTest6 {
	// main function
	public static void main(String[] args) {
	
		// 삼항 연산자
		// 조건식 ? 결과1(True의 경우) : 결과2(False의 경우);
		
		int Num1 = (5 > 3) ? 10 : 20;
		System.out.println(Num1);
		
		int Num2 = (5 < 3) ? 10 : 20;
		System.out.println(Num2);
		
		//JDK가 만들어준 도구를 이용해 봅시다.
		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요.");
		
		// 파일 입출력?? 얘는 JDK에서 끌어오는거
		// Ctrl + Shif + 'O' : 이거 쓰고 나면 3번째 줄 봐라. import 해서 쓸 수 있구나.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 1: ");
		int x = scanner.nextInt();
		System.out.println("입력 2: ");
		int y = scanner.nextInt();
		
		// 삼항 연산자 식
		max = (x>y)?  x : y;
		// 결과 출력
		System.out.println("큰 숫자는 " + max + "입니다.");
		
		
		
		
		

	}	// end of main

} // end of class
