package ch03;

public class WarriorMainTest {

	public static void main(String[] args) {
		// 직접 코드를 실행시켜 주세요.
		// 멤버 함수
		Warrior warrior1 = new Warrior();
		warrior1.name = "특공전사1";
		warrior1.hp = 100;
		warrior1.mp = 50;
		warrior1.power = 1;
		
		warrior1.attack();
		warrior1.Info();
		
	}

}
