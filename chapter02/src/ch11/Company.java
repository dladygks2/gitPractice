package ch11;

public class Company {
	
	// 싱글톤패턴 설계, 생성
	
	// 1. 생성자를 private 로 만든다.
	private Company() {
		
	}
	
	// 2. static 변수를 활용해서 내부에서 객체를 생성한다.
	private static Company instance = new Company();
	
	// 적자마자 주소값이 할당된다????
	// instance는 변수로 만들어진 것
	
	
	// 3. 외부에서 유일한 인스턴스를 참조할 수 있는 public method를 제공해야 한다.
	public static Company getInstance() {
		// 방어적 코드 
		return instance;
	}
	
	
	
}
