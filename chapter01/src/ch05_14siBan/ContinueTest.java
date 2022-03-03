package ch05_14siBan;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		
		// 예약어 continue
		// 무시하고 진행하는 continue
		// 스캐너 이용해서 MAX값, MULTIPLE값 받아서 프로그램을 완성해 주세요.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("MAX : ");
		final int MAX = scanner.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("MULTIPLE : ");
		final int MULTIPLE = scanner2.nextInt();
		
		
		final int MIN = 21;
						
		int num;
		int count =0;
		
		for(num = MIN; num <MAX ; num++) {
			// 3에 배수이면 출력하지 마시오.
			if(num % MULTIPLE == 0) {
				count ++;
				continue;		// 3의 배수이면 패스한다. 밑으로 가지 않고 바로 for()구문 처음으로 감.
			} // end of if
			
			
			
		}	// end of for
		
		// System.out.println("출력 값 : " + num);
		System.out.println(MULTIPLE + "의 배수의 개수 : " + count);
		
	}		// end of main function

}		// end of class 
