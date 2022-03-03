package practice211028;

public class CH03Student {
	
	// 멤버 변수 
	public int studentID;
	public String studentName;
	public String address;
	
	// 메서드 (클래스 안에 만들어진 함수?), void = 반환값 없음.
	public void showStudentInfo() {
		System.out.println("학번 : " + studentID + "\n학생이름 : " + studentName + "\n주소 : " + address);
	}
	
	// String 문자를 반환할 거라는 표시
	public String getStudentName() {
		return studentName;
	}

}
