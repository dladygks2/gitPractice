package practice211028;

public class Day06_Ch07_MainTest1 {

	public static void main(String[] args) {
		
		Day06_Ch07_Bank bank = new Day06_Ch07_Bank();
		// 멤버 변수의 성질 확인
		// int balance --> 0
		//double --> 0.0
		// String --> null
		
		bank.deposit(10_000);
		bank.showInfo();
		
		// 출금기능
		bank.withdraw(5_000);
		//System.out.println("돌려받은 금액 : " + money);
		bank.showInfo();
		
		/* 신입이 실수로 멤버 변수에 바로 접근해서 잔액을 수정함
		 * bank.balance = 100_000;
		 */
		// bank.balance = 100_000;
		bank.showInfo();
		
		// 
		// getter, setter
		// read only
		int returnMoney = bank.getBalance();
		System.out.println(returnMoney);
		
		//setter 사용해보기
		bank.setBalance(-10000);
		bank.showInfo();
		
		// 접근 제어 지시자
		/*
		 * public - 누구나 접근을 허용하게 한다.
		 * default - 같은 패키지 내에서 접근을 허용한다.
		 * protected - 상속관계에서 접근을 허용한다.
		 * private - 같은 클래스에서만 접근을 허용한다.
		 */
	}
}
