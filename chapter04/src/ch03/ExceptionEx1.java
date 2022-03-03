package ch03;

public class ExceptionEx1 {

	public static void main(String[] args) {
		
		// 예외처리
		// try - catch문
		
		// 예외를 발생시켜 보자.
		
		int[] arr = {1,2,3,4,5};
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);	// runtime exception이 발생한다. 배열의 범위에 벗어남
//		}
//		
		
		try {
			// 예외가 발생할 코드를 try문에 작성을 합니다.
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e);
			System.out.println("예외가 발생함!!!");
		}
				
		System.out.println("비정상 종료되지 않았습니다.");
		
		// 프로그래밍이 종료되지 않고 계속 실행되어진다.
		// (예외처리의 중요목적. 다운되지 않고 프로그램이 진행되도록 함.)
	
		
		
	}
}
