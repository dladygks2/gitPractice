package ch04;

public class SubwayMainTest {

	public static void main(String[] args) {

		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		 
		
		System.out.println("1))===============\n");
		
		subway1.showInfo();
		System.out.println(); 
		
		
		System.out.println("== 호선// 몇 명? // 수익금 == \n");
		System.out.println();
		subway1.SuIck(1700);
		subway1.showInfo();
		System.out.println();
		
		
		System.out.println("2))=============== \n");
		subway2.SuIck(3000);
		subway2.SuIck(2000);
		subway2.showInfo();
		System.out.println();
		
		
		System.out.println("3))=============== \n");
		subway3.SuIck(2000);
		subway3.SuIck(1200);
		subway3.SuIck(3000);
		subway3.showInfo();
		
		
		
	}

}
