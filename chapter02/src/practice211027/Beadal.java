package practice211027;

public class Beadal {
	
	public String BeadalNum;
	public String PhoneNum;
	public String BeadalAddress;
	public int Day;
	public int Time;
	public int Price;
	public int MenuNum;
	
	
	public Beadal(String BeadalNum, String PhoneNum, String BeadalAddress, int Day, int Time, int Price, int MenuNum) {
		this.BeadalNum = BeadalNum;
		this.PhoneNum = PhoneNum;
		this.BeadalAddress = BeadalAddress;
		this.Day = Day;
		this.Time = Time;
		this.Price = Price;
		this.MenuNum = MenuNum;
	}
	
	public String showUserInfo() {
		return "주문번호 : " + BeadalNum + "\n전화번호 : " + PhoneNum + "\n주소 : " + BeadalAddress 
				+ "\n날짜 : "+ Day +"\n시간 : " + Time + "\n가격 : " + Price + "\n주문메뉴 : " + MenuNum;
		
	}

}
