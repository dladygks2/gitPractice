package ch03_14siBan;

public class ShortCircuitTest {
	// 메인함수
	public static void main(String[] args) {
		
		int num1 = 5;
		int i = 0;
		
		boolean value = ((num1 = num1 + 10) < 10) && (( i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		// i 값은 앞에 이미 앞에서 false가 나왔기 때문에 i 값부분은 계산 안하고 넘긴다.
		
		
		value = ((num1 = num1 + 10) < 10) || ((i = i +2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
