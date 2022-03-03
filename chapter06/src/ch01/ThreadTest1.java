package ch01;

public class ThreadTest1 {

	// 메인함수 <-- 메인 쓰레드
	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.print("-");

			// static method = Thread
			try {
				Thread.sleep(500);// 0.5초
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		} // end of for

		/*
		 * Thread???
		 * 
		 */

	}// end of main

}// end of class
