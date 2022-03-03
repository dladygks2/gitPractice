package practice211028;

public class Ch02FunctionMainTest1 {

	// 메인함수 부분이 실행을 하는 부분인듯
	public static void main(String[] args) {

		// 함수 사용 방법(모양 맞추기)
		int addResult1 = add(10, 77);
		System.out.println("addResult1 = " + addResult1);

		int addResult2 = add(10, 30);
		System.out.println("addResult2 = " + addResult2);

	}// end of main

// add 함수를 생성
// 하나의 클래스에서는 메인 함수만하나이고, 그냥 함수들은 계속 만들어낼 수 있다.
	public static int add(int num1, int num2) {

		int result;
		result = num1 + num2;

		return result;	// 리턴 키워드를 만났을 때 실행에 제어권을 반환한다...
		
		// public static int = int 값을 반환해야한다.
		// public static void = void는 딱히 반환없다는 뜻이다.

	}
}// end of class