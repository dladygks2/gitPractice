package practice211027;

public class FunctionTest {

	public static int addNum(int n1 , int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for (i=0; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int num1 =10;
		int num2 =20;
		
		int total = addNum(num1, num2);
		
		sayHello("¾È³çÇÏ¼¼¿ä");
		int sum = calcSum();
		
		System.out.println(total);
		System.out.println(sum);
		
	}
	
}
