package ch12;

public class MainTest1 {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "데미안", "헤르만 헤세1");
		Book book2 = new Book(1, "데미안", "헤르만 헤세2");
		
		System.out.println(book1 == book2);
		System.out.println(book1);
		
		boolean result = "a".equals("a");
		System.out.println(result);
		System.out.println("a" == "a");
		System.out.println("=--==========-=-=");
		
		
		// equals 메서드를 재정의  했다. ( book 클래스 안에서)
		// equals 의 기본 동작은 같은 주소값을 가진 애들인가를 판단
		if (book1.equals(book2)) {
			System.out.println("같은 책입니다.");
		} else {
			System.out.println("다른 책입니다.");
		}
		
		/*
		 * 객체지향 핵심과정 
		 * 
		 * 이거 과제로...201101 1532
		 * 
		 * 오버로딩 : 같은 이름으로 다른 기능을 수행?
		 * 다형성 : 유연하고 확장성있는 코드 
		 * 상속 : 같은 코드가 보이고 바텀업 방식으로 만드는 것이
		 * 추상클래스 
		 * 인터페이스
		 * 
		 * 
		 */
		
		
		
	}
}
