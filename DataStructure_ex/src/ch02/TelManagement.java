package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {
////////////////////////////////////////////
	// 삽입하는 기능
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;

		String name, address, telephone;

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 >> ");
		name = sc.next();

		System.out.println("주소 >> ");
		address = sc.next();

		System.out.println("전화번호 >> ");
		telephone = sc.next();

		// 새로운 객체를 생성함
		phone = new Phone(name, address, telephone);

		map.put(phone.name, phone);

	}

///////////////////////////////////////////////
	// 삭제하는 기능
	public static void delete(HashMap<String, Phone> map) {

		String delName;

		// key는 이름을 입력 받아서 사용
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력합시다.");

		delName = sc.next();

		if (map.containsKey(delName)) {
			// 삭제 기능
			map.remove(delName);
		} else {
			System.out.println(delName + "은 등록되지 않은 사람입니다.");
		}

	}

///////////////////////////////////////////////////
	// 찾기
	public static void search(HashMap<String, Phone> map) {

		String searchName;
		Scanner s = new Scanner(System.in);
		System.out.println("이름 >>>");
		searchName = s.next();
		if (map.containsKey(searchName)) {
			System.out.println(searchName + " " + map.get(searchName).telephone);

		} else {
			System.out.println(searchName + "은 등록되지 않은 사람입니다.");
		}
		// key는 이름을 입력받아서 찾고 화면에 보여주세요.
	}

///////////////////////////////////////////////////
	// 전체보기
	public static void showInfo(HashMap<String, Phone> map) {

		Set<String> names = map.keySet();

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + "" + person.telephone);
		}

		// 화면에 전체 정보를 뿌려주는 기능을 만들어 주세요.
	}

/////////////////////////////////////////////////////
	// 메인함수
	public static void main(String[] args) {

		HashMap<String, Phone> map = new HashMap<String, Phone>();
		// 메서드 이용해보기

//		map.put("홍길동", new Phone("홍길동", "부산시", "010-1234-1244"));
//		map.put("이순신", new Phone("이순신", "서울시", "010-1234-1244"));

//		insert(map);
//		delete(map);

//		search(map);
//		showInfo(map);

//		insert(map);

		// 실행의 흐름 만들어 보기
		int menu;

		System.out.println("-------------------");
		System.out.println("전화번호 관리 프로그램");
		System.out.println("-------------------");

//		System.out.println("추가 0, 삭제 1, 찾기 2, 전체보기 3, 종료 4");

		// 스캐너 이용해서

//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("번호 입력 : ");
//		
//		int Input;
//		
//		Input = sc2.nextInt();
//		
//		if(Input ==0) {
//			// 추가
//			insert(map);
//			
//		}else if(Input ==1) {
//			// 삭제
//			delete(map);
//		}else if(Input ==2) {
//			// 찾기
//			search(map);
//		}else if(Input ==3) {
//			// 전체보기
//			showInfo(map);
//		}else if(Input == 4) {
//			// 종료
//			
//		}else 

		/////////////
		Scanner scanner = new Scanner(System.in);

//		menu = scanner.nextInt();

		while (true) {
			System.out.println("추가 0, 삭제 1, 찾기 2, 전체보기 3, 종료 4");
			menu = scanner.nextInt();

			switch (menu) {
			case 0:
				insert(map);
				break;
			case 1:
				delete(map);
				break;
			case 2:
				search(map);
				break;
			case 3:
				showInfo(map);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("Re Input");
				break;

			}

		}

//		
//		System.out.println("==================");
//		System.out.println(map);
//		System.out.println(map.values());
//		System.out.println("del=========");
//		delete(map);
//		System.out.println("===========");
//		System.out.println(map);
	}
}
