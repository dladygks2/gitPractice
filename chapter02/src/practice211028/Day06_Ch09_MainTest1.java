package practice211028;

public class Day06_Ch09_MainTest1 {

	public static void main(String[] args) {
		
		Day06_Ch09_NumberPrinter numberPrinter1 = new Day06_Ch09_NumberPrinter(1);
		Day06_Ch09_NumberPrinter numberPrinter2 = new Day06_Ch09_NumberPrinter(2);
		Day06_Ch09_NumberPrinter numberPrinter3 = new Day06_Ch09_NumberPrinter(3);
		
		numberPrinter3.printWaitNumber();
		numberPrinter3.printWaitNumber();
		numberPrinter3.printWaitNumber();

		System.out.println("-------------------------");
		//
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
		
		System.out.println("-------------------------");
		
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
	}
	
}
