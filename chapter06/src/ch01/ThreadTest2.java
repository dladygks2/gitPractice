package ch01;

class MyThreadEx2 extends Thread {

	String name;

	public MyThreadEx2(String name) {
		this.name = name;
	}

	// 약속 : run()안에서 작성해야 작업처리가된다.
	@Override
	public void run() {
		int i;
		for (i = 0; i < 5; i++) {

			System.out.println(name + ":" + (i+1) + "\t");

			// 예외처리
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}// end of run

}// end of MyThreadEx2

public class ThreadTest2 {
	// main Thread
	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		System.out.println("메인 쓰레드 시작");

		MyThreadEx2 th1 = new MyThreadEx2("작업자1"); // maint thread랑 / new() 이런것들이 작업자
		th1.start(); // Thread의 작업을 시작하라는 명령어 (.start())

//		for (int i = 0; i < 50; i++) {
//
//			System.out.println("test : " + i);
//
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

		MyThreadEx2 th2 = new MyThreadEx2("작업자2");
		th2.start();

		MyThreadEx2 th3 = new MyThreadEx2("작업자3");
		th3.start();

		System.out.println("메인 쓰레드 종료");

	}// end of main
}// end of class
