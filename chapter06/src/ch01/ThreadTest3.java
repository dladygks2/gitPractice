package ch01;

class MyThread3 extends Thread {

	// Thread가 해야할 일
	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + ":" + Thread.currentThread());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class ThreadTest3 {

	// main thread
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());

		// 작업자 3명 생성

		MyThread3 th1 = new MyThread3();
		MyThread3 th2 = new MyThread3();
		MyThread3 th3 = new MyThread3();

		// 작업을 시작시켜 주세요. 
		// start가 제일 마지막에 처리되는 건가 
		// run이랑 비교하면?? 아닌데...
		
		th1.start();
		System.out.println("-------");
		th2.run();
		System.out.println("======");
		th3.run();

	}// end of main

}// end of class
