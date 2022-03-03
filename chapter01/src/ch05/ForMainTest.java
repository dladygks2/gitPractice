package ch05;

public class ForMainTest {
	public static void main(String[] args) {
		int sum=0;
				
		/*
         *
		 * 		for(초기화식; 조건식; 증감식){
		 * 				수행문;
		 *		 }
		 *
		 */
		
		// for 문을 사용해서 1부터 10까지 덧셈 연산
		
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			System.out.println("i 값: "+i);
		
		}
		System.out.println("합계: "+sum);

		
		
		
	}

}
