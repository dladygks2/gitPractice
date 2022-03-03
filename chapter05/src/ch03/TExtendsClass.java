package ch03;

public class TExtendsClass {

	public static void main(String[] args) {
		
		// <T extends 클래스> 사용하기
		// T 자료형의 범위를 제한 할 수 있음
		// 범위를 제한하지 않으면 자료형으로 아무 클래스나 올 수 있다.
		
		GenericPrinter2<Powder> powderPrinter = new GenericPrinter2<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);

		System.out.println("-----------------------------");
		
		// water는 프린터재료가 아니라 사용이 안된다. 이때 T extends class 사용할 수 있다는데
//		GenericPrinter2<Water>printer2 =new GenericPrinter2<Water>();
		
		
	}
}
