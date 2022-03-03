package ch05;

public class MainTest3 {

	public static void main(String[] args) {
		// 다형성 : 배열(자료구조) 관계에서도 사용가능
		// 하나의 변수에 연관된 데이터를 통으로 관리하기 위해서 사용

		// 1.
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();

		Banana[] bananaBucket = new Banana[2];
		bananaBucket[0] = banana1;
		bananaBucket[1] = banana2;

		// foreach문 써서 . 바나나의 showInfo() 호출
//		for (Banana banana : bananaBucket) {
//			banana.showInfo();
//			System.out.println("-------------");
//		}

		// 2.
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();

		// 배열사용해서 담아주세요
		// 배열은 2칸

		Peach[] peachBucket = new Peach[2];
		peachBucket[0] = peach1;
		peachBucket[1] = peach2;

		for (Peach peach : peachBucket) {
			peach.showInfo();
			System.out.println("---------------");
		}

		// 3. 다형성을 사용한다면
		Fruits[] fruitsBucket = new Fruits[4];
		fruitsBucket[0] = banana1;
		fruitsBucket[1] = peach1;
		fruitsBucket[2] = banana2;
		fruitsBucket[3] = peach2;

		for (Fruits fruits : fruitsBucket) {
			fruits.showInfo();
		}

	}
}
