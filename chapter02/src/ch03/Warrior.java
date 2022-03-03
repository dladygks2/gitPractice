package ch03;

public class Warrior {
// 클래스 설계
	
	// 멤버 변수
	 String name;	// 변수의 이름은 소문자로 시작
	 int hp;
	 int mp;
	 int power;
	 
		
	
	// 멤버 함수
	 public void attack() {	// 메서드 이름도 소문자로시작
		 System.out.println("기본 공격");
	 }
	 
	 public void Info() {
		 System.out.println("===정보창===");
		 System.out.println("이름 : " + name);
		 System.out.println("체력 : "+ hp);
		 System.out.println("힘 : " +power);
	 }
	 
	 
}
