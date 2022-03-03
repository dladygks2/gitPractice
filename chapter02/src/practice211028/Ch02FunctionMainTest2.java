package practice211028;

public class Ch02FunctionMainTest2 {

	public static void main(String[] args) {
		// 함수 사용하는 방법(모양 맞추기)
		int num1 = 10;
		int num2 = 20;
		//1.
		double total = addNum(42.123, 10.5);
		System.out.println("total : " + total);
		///////
		//2.
		sayHello("반갑습니다.");
		/////////
		//3.
		int sum = calSum();
		System.out.println("sum : " + sum);

		System.out.println("--------------------------");

		/// 함수 사용하기
		//4.
		int result1 = intAdd(10, 20, 30);
		System.out.println("result1 : " + result1);

		///////
		//5.
		double result2 = doubleAdd(10.5, 0.5);
		System.out.println(result2);
		//6.
		printArticle("기사 제목 : 날씨 좋음 !!!!");

	}//end of main

	//1.
	public static double addNum(double d1, double d2) {
		double total = d1 + d2;
		return  total;
	}
	//2.
	public static void sayHello(String greet) {
		System.out.println(greet);
		// 리턴값이 없으니까 void 이구나...
	}
	
	//3.
	public static int calSum() {
		int sum =0;
		int i;
		
		for(i = 1; i<=100; i++) {
			sum+=i;
		}
		return sum;
	}
	//4. 
	public static int intAdd(int a, int b, int c) {
		int result1 = a + b + c;
		return result1;
	}
	//5.
	public static double doubleAdd(double a, double b) {
		double result2 = a + b;
		return result2;
	}
	//6. 
	public static String printArticle(String a) {
		return a;
	}


}



