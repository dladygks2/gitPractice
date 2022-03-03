package ch02_14siBan;

public class TypeConversion {

	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		// 데이터 형 변환
		// int 자료형을 double로 변경하거나 
		// double 자료형을 int로 변경하는 것을 말합니다. double에는 실수형이 담긴다.
		int iNum1 = 100;
		System.out.println(iNum1);
		
		// 자동 형변환 : 작은놈을 큰거에 넣을 때에는 그냥 자동으로 넘어감
		double dNum1 = iNum1;
		System.out.println(dNum1);

		
		// 강제 형변환 : 반대 상황이라서 강제로 명령해야함
		double dNumber = 1.12345;
//		int iNumber = dNumber;
		
		// int = 4bytes// double = 8bytes iNumber 크기가 dNumber 보다 작아서 담질 못한다.
		
		
		// 개발자가 '컴파일러야 괜찮으니깐 그냥 강제로 넣어.' 강제 형변환 = (int) 
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
			
		// 연습
		double aValue;
		int bValue;
		
		aValue = 0.5;
		bValue = (int)10.1;
		// 10.1을 int로 바꿔서 넣어야한다. 소수점은 날린다. 정수형이니까
		
		System.out.println(bValue);
		
	}// end of main

}// end of class
