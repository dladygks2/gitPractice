package ch02;

import java.util.Scanner;

class MyThread1 extends Thread {

	boolean flag = true;

	@Override
	public void run() {

		while (flag) {
			System.out.print("-");

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}// end of run

}// end of class

public class ThreadEx1 {

	public static void main(String[] args) {

		System.out.println("작업자를 생성하겠습니다.");
		// 메인 쓰레드가 작업자를 요청해서 생성한다.
		MyThread1 thread1 = new MyThread1();
		thread1.start();

		System.out.println("0번을 입력하면 중지합니다.");
		Scanner scanner = new Scanner(System.in);
//		int userInput = scanner.nextInt();

//		if (userInput == 0) {
////			thread1.stop();// deprecated(더이상 유지보수하지 않음)
//			thread1.flag = false;
//		}

		// 문제 3.
		// do while 사용해서 코드를 수정, 입력을 잘못했을때 다시 입력할 수 있도록.

		// 1. do while 문 사용방법

		int userInput = 100;

		do {
			userInput = scanner.nextInt();

			if (userInput == 0) {
				thread1.flag = false;
			}

		} while (userInput != 0);

		// 2. do 안에 어떤 코드가 들어가야할지

		// 3. while 문에 조건식을 구현

	}

}
