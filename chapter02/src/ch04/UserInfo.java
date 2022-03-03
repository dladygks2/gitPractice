package ch04;

public class UserInfo {
	
	// 멤버 변수를 지정
	String userId;
	String userPassWord;
	String userName;
	String userAddress;
	String phoneNumber;
	

	
	// Alt Shift S 를 누르면 - 자동대화상자 나옴- generate constructor using fields 가 나옴
	
		
//	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
//		super();
//		this.userId = userId;
//		this.userPassWord = userPassWord;
//		this.userName = userName;
//		this.userAddress = userAddress;
//		this.phoneNumber = phoneNumber;
//	}
	// 생성자가 없으면 컴파일러가 알아서 기본생성자를 생성 그러나 하나라도 생성자 넣어주면
	// 컴파일러가 넣어주지 않는다.
	
	// 생성자 오버로딩 : 생성자 하나로 여러개 생성자를 만드는 것을 오버로딩이라고한다. 
	// 중요! 생성자는 객체가 생성될 때, 처음 실행되는 코드입니다.
	
	
	
	// 1. 기본 생성자를 만들어 주세요.
	public UserInfo() {
		
	}
	// 2. userId 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId) {
		this.userId = userId;
	}
	// 3. userId, userPassword 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
	// 4. userId, userPassword, userName 만 받는 생성자를 만들어 주세요.
	public UserInfo(String userId, String userPassWord, String userName) {
	this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	// 5. userId, userPassword, userName, userAddress
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
	this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	// 6. userId, userPassword, userName, userAddress,phoneNumber
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
}
