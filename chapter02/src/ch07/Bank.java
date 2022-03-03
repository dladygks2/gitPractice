package ch07;

public class Bank {
	
	// 정보 은닉
	// private 이라는 접근제어지시자를 설정
	private int balance =0;
	
	// 메서드 생성

	// 입금 기능
	public void deposit(int money) {
		this.balance += money;
	}

	// 출금 기능
	public int withdraw(int money) {
		this.balance -= money;
		return money;
	}	
	// 잔액 확인 기능
	public void showInfo() {
		System.out.println("현재 잔액은 " + this.balance + "원 입니다.");
	}
		
	// getter 메서드 만들기
	// 멤버변수를 메서드를 통해서 넘기는 것
	// 일반적으로 get() 메소드를 만들어서 
	// 외부에서 확인할 수 있도록 구현한다.
	public int getBalance() {
		return this.balance;
	}
	
	// setter 메서드 만들기
	// 멤버변수의 값을 변경할 수 있도록 한다.
	// 그래서 매개 변수로 int balance 를 사용한다.
	// 일반적으로 set() 메소드를 제공해서
	// 외부에서 멤버변수에 접근할 수 있도록 구현한다.
	public void setBalance(int balance) {
		
		if(balance <0) {
			System.out.println("잘못된 입력입니다.");
		}else {
			this.balance = balance;
		}
		
	}
	
	
	
	
}














