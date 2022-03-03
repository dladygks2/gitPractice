package ch05_14siBan;

public class WhileMainTest {
	
	// main function
	public static void main(String[] args) {
		
		
		// 1~10 까지 덧셈 연산
		
		int num = 1;
		int sum = 0;
		while(num <=10) {
			System.out.println("현재 값 : " + num);
			sum += num;
			num++;
			
			// 예외처리란다. 이 밑에 부분
			try {
				// Thread.sleep(500);	// 0.5초 동안 멈추는 역할 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} // end of while
		
		System.out.println("연산의 결과값은 :"+ sum + "입니다.");
		

	}	// end of main

}	// end of class
