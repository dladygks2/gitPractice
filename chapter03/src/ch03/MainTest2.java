package ch03;

class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiPly(int n1, int n2) {
		return n1 * n2;
	}

}

////////////////////////////////////////////////////////////
class Cal2 extends Cal {

	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	// 메서드 오버로딩 =! 메서드 오버라이드

	// 메서드 오버라이드 : 부모에 있는 메서드를 필요에 의해서
	// '재정의'해서 사용하는 개념
	
//	public int multiPly(int n1, int n2) {
//		if(n1 ==0 || n2 == 0) {
//			System.out.println("0을 입력하지 마세요.");
//		}
//		return n1 * n2;
//	}

	@Override
	public int multiPly(int n1, int n2) {
		System.out.println("multiply 메서드를 실행합니다.");
		if (n1 == 0 || n2 == 0) {
			System.out.println("화면에 0을 입력하지 마세요.");
		}
		return super.multiPly(n1, n2);
		// this.name = name; 형식이 비슷
		// super = 부모 클래스에 가서 해당 코드를 수행하여라라는 명령어
	}

}

/////////////////////////////////////////////////////////////////
public class MainTest2 {

	public static void main(String[] args) {

		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multiPly(10, 0));
	}
}
