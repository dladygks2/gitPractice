package ex01;

public class Wizzard {
 
	// 멤버 변수
	// hp, power, name
	String WizzardName;
	String WizzardJob;
	String WizzardGuild;
	String WizzardTitle;
	
	int hp = 10;
	int mp = 30;
	
	int pwr = 10;
	int dex = 15;
	int mag = 30;
	int def = 5;
	
	// 생성자도 만들어 주세요. 
	
	// 생성자 오버로딩

	// WizzardSkill
		public void attack() {
			System.out.println("기본 공격");
			System.out.println(pwr*2 + "의 데미지를 주었습니다.");
			System.out.println("---------------------------");
			
		}
		public void skill1() {
			System.out.println("파이어 볼");
			System.out.println(mag*10 + "의 데미지를 주었습니다.");
			System.out.println("10 mp를 사용하였습니다.");
			mp -= 10;
			System.out.println("---------------------------");
			
			
		}
			
		public void skill2() {
			System.out.println("매직 아머");
			System.out.println(mag*3 + "의 방어력이 상승하였습니다.");
			System.out.println("7 mp를 사용하였습니다.");
			mp -=7;
			System.out.println("---------------------------");
			
		}
		public void skill3() {
			System.out.println("헬 파이어");
			System.out.println(mag*30 + "의 데미지를 주었습니다.");
			System.out.println("25 mp를 사용하였습니다.");
			mp -= 25;
			System.out.println("---------------------------");
			
		}
		public void skill4() {
			System.out.println("파이어 스피어");
			System.out.println(mag*20 + "의 데미지를 주었습니다.");
			System.out.println("17 mp를 사용하였습니다.");
			mp -= 17;
			System.out.println("---------------------------");
			
		}
		
		public void smallPortionRed() {
			System.out.println("체력이 15 올랐습니다.");
			hp += 15;
			System.out.println("---------------------------");
			
		}
		public void smallPortionBlue() {
			System.out.println("마나가 15 올랐습니다.");
			mp += 15;
			System.out.println("---------------------------");
			
		}
		
		// 얘가 생성자 인가
		public Wizzard(String name, String job, String guild, String title) {
			WizzardName = name;
			WizzardJob = job;
			WizzardGuild = guild;
			WizzardTitle = title;
			
			// this.name = name; 
			// 같은 식으로 해야 했네. 
		}
		
		public void wizzardInfo() {
			System.out.println("====정보창====");
			System.out.println("이름 : " + WizzardName);
			System.out.println("직업 : " + WizzardJob);
			System.out.println("길드 : " + WizzardGuild);
			System.out.println("칭호 : " + WizzardTitle);
			System.out.println("====능력치====");
			System.out.println("체력 : " + pwr);
			System.out.println("민첩 : " + dex);
			System.out.println("마력 : " + mag);
			System.out.println("방어력 : " + def);
			
		
		}
	// 메서드
	
	// 전사를 공격한다.
	// 상태창을 꾸며서 볼 수 있는 기능을 만들어 주세요.
		
}
