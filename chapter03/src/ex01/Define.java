package ex01;

public class Define {

	// static은 프로그램 시작하자마자 메모리에 올라간다.
	// 따로 new() 선언 안해도됨
	public static final int MIN = 1;
	public static final int MAX = 9999;
	public static final double PI = 3.14;
	public static final String GREETING = "Good Morning";
	public static final int MATH_CODE = 1001;

	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
// Define define = new Define();
// 이거 안해도 메모리에 올라간다. static은
		System.out.println(Define.MIN);
		System.out.println(Define.MAX);
		System.out.println(Define.PI);
		System.out.println(Define.GREETING);
		System.out.println(Define.MATH_CODE);

	} // end of main

}
