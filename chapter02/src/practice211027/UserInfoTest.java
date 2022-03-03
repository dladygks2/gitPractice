package practice211027;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userLee = new UserInfo();
		userLee.userId = "a12345";
		userLee.userPassWord = "zxcvbn12345";
		userLee.userName = "Lee";
		userLee.userAddress = "Seoul, Korea";
		userLee.phoneNumber = "01034556699";
		
		System.out.println(userLee.showUserInfo());
		
		System.out.println("----------------------");
		UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");
		
		System.out.println(userKim.showUserInfo());
	}
}
