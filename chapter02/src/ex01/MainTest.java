package ex01;

public class MainTest {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Warrior warriorA =  new Warrior("강한놈", "탱커", "destroy단", "수호전사");
				
		warriorA.attack();
		warriorA.attack();
		warriorA.skill1();
		warriorA.smallPortionBlue();
		warriorA.smallPortionRed();
		warriorA.skill2();
		warriorA.smallPortionBlue();
				
		Wizzard wizzardA = new Wizzard("쎈 법사", "마법사","HarryPoter","불꽃법사");
		
		wizzardA.attack();
		wizzardA.skill1();
		wizzardA.skill2();
		wizzardA.smallPortionBlue();
		wizzardA.skill3();
		wizzardA.smallPortionBlue();
		wizzardA.skill4();
		
		
		warriorA.warriorInfo();
		
		wizzardA.wizzardInfo();
		
	}

}
