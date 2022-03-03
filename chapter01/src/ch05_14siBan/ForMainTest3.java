package ch05_14siBan;

public class ForMainTest3 {

	public static void main(String[] args) {

		// 1 부터 9까지 반복
		
//		for(int num =2; num <=9; num++) {
//		
//			for(int j =1 ; j <= 9; j++) {
//				System.out.println( num + "*" + j + "=" + (j*num));
//			
//			}System.out.println("===============");	
//		}	// 이중 for 문
	
		int num = 0;
		
		for(num = 2; num <= 9; num++) {
			
			// 2~9 까지 반복한다.
			
			for(int i =1; i <=9; i++) {
				
				System.out.println(num + "*" + i + "=" + ( num* i));
			}
			System.out.println();
			
		}
		
		
		
	
	
	
	
	
	
	
	}

}


