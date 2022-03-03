package ch10;

public class CompleteCalc extends Calculator {

	public int times(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		int result = 0;
		
		if (num2 == 0) {
			System.out.println("0으로 못나눔");
			return ERROR;
		} else {
			return num1 / num2;
		}

	}

	public void showInfo() {
		System.out.println("모두 구현");
	}

}
