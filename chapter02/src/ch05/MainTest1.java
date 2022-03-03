package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		// 버스 만들기
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Bus bus300 = new Bus(300);
		
		
		// 학생 만들기
		Student student1 = new Student("홍길동", 10_000);
		Student student2 = new Student("야스오", 50_000);
		Student student3 = new Student("티모", 20_000);
		
		// 10000 보다 10_000 이 가독성이 높다. 똑같은 10000
		
		// Subway
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		System.out.println("------------- 등굣길 -------------");
		System.out.println();
		
		// 처음 학생들이 가진 돈
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		System.out.println("위에는 처음 학생들이 가진 돈들");
		
		
		
		// 학생이 버스를 탄다.		
		student1.takeBus(bus300);
		
		// 학생이 지하철을 탄다.
		student1.takeSubway(subway2);
		
		// 상태창 확인
		student1.showInfo();
		
		student2.takeSubway(subway3);
		student2.takeBus(bus300);
		student2.takeBus(bus100);
		student2.takeSubway(subway2);
		
		student3.takeBus(bus100);
		student3.takeBus(bus200);
		student3.takeSubway(subway1);
		
		
		student1.showInfo();
		student2.showInfo();
		student3.showInfo();
		 
		
		//
		System.out.println("----------");
		bus100.showInfo();
		bus200.showInfo();
		bus300.showInfo();
		
		System.out.println("----------");
		subway1.showInfo();
		subway2.showInfo();
		subway3.showInfo();
		
		
		System.out.println("----------");
		System.out.println("----- 하굣길 ------");
		System.out.println("----------");
	
	
	}

}
