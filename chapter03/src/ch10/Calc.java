package ch10;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -99999;
	
	// 추상 메서드
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
//	void showInfo();
	
	// add, 매개변수 num1, num2 + : 얘는 구현
	// substract, 매개변수 num1, num2 - : 얘는 구현
	// times, 매개변수 num1, num2 * : CompleteCalc로 넘김
	// divide, 매개변수 num1, num2 / : CompleteCalc로 넘김
		
	// public abstract 생략
	// return type은 int
	// void showInfo();
	
	
	
	
}
