package ch10;

public class HatcheryMainTest {

	public static void main(String[] args) {

		Hatchery hatchery = new Hatchery("«ÿ√≥∏Æ1");
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		hatchery.createZergling();
		System.out.println(Hatchery.zerglingCount);

	}

}
