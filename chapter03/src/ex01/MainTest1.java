package ex01;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
	
		zealot1.attack(zergling1);
		zealot1.attack(marine1);
		
		marine1.showInfo();
		zergling1.showInfo();
		
		// 스캐너를 사용해서 실행의 흐름을 만들어 보세요.
		// 1. 질럿이 마린을 공격한다.
		// 2. 마린이 저글링을 공격한다.
		// 3. 저글링이 질럿을 공격한다.
		
		System.out.println("입력 : ");
		Scanner sc = new Scanner(System.in); 
		int input = sc.nextInt();
		
		// 상수 사용해보자
		final int ZEALOT_ATTACK =1;
		final int MARINE_ATTACK =2;
		final int ZERGLING_ATTACK =3;
		
		
		if(input == ZEALOT_ATTACK) {
			// 질럿이 마린을 공격
			zealot1.attack(marine1);
		}else if(input ==MARINE_ATTACK) {
			// 마린이 저글링을 공격
			marine1.attack(zergling1);
		}else if(input == ZERGLING_ATTACK) {
			// 저글링이 질럿을 공격
			zergling1.attack(zealot1);
		}else {
			System.out.println("1, 2, 3 중에서 입력");
		}
		
		/*Scanner sc = new Scanner(System.in);
		 * boolean gameOver = false;
		 * int userInput = 0;
		 * while (!(gamaOver)){
		 *	System.out.println("질럿이 마린을 공격");
		 */
		// System.out.println("2.");
		
		
		
		// --> 1 2 3 <--
		// --> 1 2 3 <--
		
	} // end of main
}	//end of class
