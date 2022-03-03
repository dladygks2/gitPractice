package ch05;

class BankAccount{
	
	private int money = 100_000;
	
	public int getMoney() {
		return this.money;
	}
	
	public void setMoney(int money) {
		
		if(money <= 0) {
			System.out.println("잘못된 입력");
		}else {
			this.money += money;
		}
	}
	
	public synchronized void saveMoney(int money) {
		
		int currentMoney = getMoney();		// 지금 저장되있는 돈
		System.out.println("메서드 동작 확인 1 : saveMoney");
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
		
	}
	
	public void withdrawMoney(int money) {
		
		int a = 100;
		
	}
	
}