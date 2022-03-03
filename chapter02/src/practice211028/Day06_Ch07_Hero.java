package practice211028;

public class Day06_Ch07_Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;

	// get : 정보를 얻어 내는 함수
	public String getName() {
		return name;
	}

	// set : 정보를 출력하는 함수
	public void setName(String name) {
		// 방어적 코드 작성
		if (name == null || name == "" || name.length() < 2) {
			System.out.println("잘못된 입력입니다. 이름을 다시 작성해 주세요.");
		} else {
			this.name = name;
		}
	}

	// hp, defense, level
	// get, set 메서드를 만들어주세요
	// 메서드를 설계하는 코드 작성
	
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		if(hp<0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			this.hp = hp;
		}
	}
	
	public double getDefense() {
		return defense;
	}
	
	public void setDefense(double defense) {
		if(defense <0) {
			System.out.println("wrong input");
		} else {
			this.defense = defense;
		}
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		if(level <0) {
			System.out.println("wrong input");
		} else {
			this.level = level;
		}
	}

	
	// main function
	public static void main(String[] args) {
		
		// make Hero object, use getter, setter method
		Day06_Ch07_Hero hero = new Day06_Ch07_Hero();
		hero.setName("야스오");
		String name = hero.getName();		// 주소값= hero, '.getName()'은 그 주소안의 기능을 선택함을 의미
		System.out.println("돌려 받는 값 : " + name);
		System.out.println("돌려 받는 값 : " + hero.getName());
	}
	
	
	
	
	
	
}
