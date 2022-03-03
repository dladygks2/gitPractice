package ch01;

public class MainTest1 {

	public static void main(String[] args) {


		Order order1 = new Order();
		// 멤버 변수의 특성 : 초기값을 가진다. int형은 0, 참조타입에서 객체 입력안했을 때 초기값 : null
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println("----------------------------");
		
		// 1. order1 값을 넣고 화면에 출력
		
		order1.orderId = "0000001";
		order1.buyerId = "GuMeaJa";
		order1.sellerId = "PanMeaJa";
		order1.productId = 1000001;
		order1.orderDate = "2021년 10월 21일";
		
		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);
		System.out.println("----------------------------");
		
		UserInfo userInfo1 = new UserInfo();
		// 2. userInfo1 값 넣고 화면에 출력

		userInfo1.userId = "Korea IT";
		userInfo1.userPassWord = "qwerty";
		userInfo1.userName = "Bush";
		userInfo1.userAddress = "USA";
		userInfo1.phoneNumber = "010-1234-5678";
		
	
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userPassWord);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.phoneNumber);
		
	}

}
