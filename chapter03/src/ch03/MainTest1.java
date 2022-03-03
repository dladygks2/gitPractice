package ch03;
// 클래스 파일 안에서 다른 클래스를 만들 것이다.

class A {
	int number1;
	int number2;
	int number3;
}

class B {
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
}
// 상속 = extends
// A는 C한테 상속한다. C는 A한테 상속받는다.라고 한다.

class C extends A {

	int number4;
	int number5;
}

public class MainTest1 {

	public static void main(String[] args) {
		C c = new C();
		c.number1 = 1;
		c.number2 = 2;
		c.number3 = 3;
		c.number4 = 4;
		c.number5 = 5;
		
		System.out.println(c.number1);
		System.out.println(c.number5);
		
		
		
	}
}
