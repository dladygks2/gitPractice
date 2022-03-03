package practice211028;

public class Day06_Ch07_Bank {
	
	// 정보 은닉
	private int balance;
	
	// 메서드
	
	// 입금 기능
	public void deposit(int money) {
		this.balance += money;
	}
	
	// 출금 기능
	public int withdraw(int money) {
		this.balance -= money;
		return money;
	}
	
	// 잔액 확인
	public void showInfo() {
		System.out.println("현재 잔액은 " + this.balance + "원 입니다." );
	}
	
	// getter 메서드 만들기
	// 일반적으로 get() 메서드를 만들어서 외부에서 확인할 수 있도록 구현한다.
	// 정보를 get하는 메서드
	public int getBalance() {
		return this.balance;
	}
	
	// setter 메서드 만들기
	// 일반적으로 set() 메서드를 제공해서 외부에서 멤버 변수에 접근할 수 있도록 
	// 구현한다.
	public void setBalance(int balance) {
		if(balance <0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.balance = balance;
		}
	}

}
