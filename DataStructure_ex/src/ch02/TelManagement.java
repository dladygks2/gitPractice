package ch02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TelManagement {
////////////////////////////////////////////
	// �����ϴ� ���
	public static void insert(HashMap<String, Phone> map) {
		Phone phone;

		String name, address, telephone;

		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� >> ");
		name = sc.next();

		System.out.println("�ּ� >> ");
		address = sc.next();

		System.out.println("��ȭ��ȣ >> ");
		telephone = sc.next();

		// ���ο� ��ü�� ������
		phone = new Phone(name, address, telephone);

		map.put(phone.name, phone);

	}

///////////////////////////////////////////////
	// �����ϴ� ���
	public static void delete(HashMap<String, Phone> map) {

		String delName;

		// key�� �̸��� �Է� �޾Ƽ� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �̸��� �Է��սô�.");

		delName = sc.next();

		if (map.containsKey(delName)) {
			// ���� ���
			map.remove(delName);
		} else {
			System.out.println(delName + "�� ��ϵ��� ���� ����Դϴ�.");
		}

	}

///////////////////////////////////////////////////
	// ã��
	public static void search(HashMap<String, Phone> map) {

		String searchName;
		Scanner s = new Scanner(System.in);
		System.out.println("�̸� >>>");
		searchName = s.next();
		if (map.containsKey(searchName)) {
			System.out.println(searchName + " " + map.get(searchName).telephone);

		} else {
			System.out.println(searchName + "�� ��ϵ��� ���� ����Դϴ�.");
		}
		// key�� �̸��� �Է¹޾Ƽ� ã�� ȭ�鿡 �����ּ���.
	}

///////////////////////////////////////////////////
	// ��ü����
	public static void showInfo(HashMap<String, Phone> map) {

		Set<String> names = map.keySet();

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			String name = it.next();
			Phone person = map.get(name);
			System.out.println(name + "" + person.telephone);
		}

		// ȭ�鿡 ��ü ������ �ѷ��ִ� ����� ����� �ּ���.
	}

/////////////////////////////////////////////////////
	// �����Լ�
	public static void main(String[] args) {

		HashMap<String, Phone> map = new HashMap<String, Phone>();
		// �޼��� �̿��غ���

//		map.put("ȫ�浿", new Phone("ȫ�浿", "�λ��", "010-1234-1244"));
//		map.put("�̼���", new Phone("�̼���", "�����", "010-1234-1244"));

//		insert(map);
//		delete(map);

//		search(map);
//		showInfo(map);

//		insert(map);

		// ������ �帧 ����� ����
		int menu;

		System.out.println("-------------------");
		System.out.println("��ȭ��ȣ ���� ���α׷�");
		System.out.println("-------------------");

//		System.out.println("�߰� 0, ���� 1, ã�� 2, ��ü���� 3, ���� 4");

		// ��ĳ�� �̿��ؼ�

//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("��ȣ �Է� : ");
//		
//		int Input;
//		
//		Input = sc2.nextInt();
//		
//		if(Input ==0) {
//			// �߰�
//			insert(map);
//			
//		}else if(Input ==1) {
//			// ����
//			delete(map);
//		}else if(Input ==2) {
//			// ã��
//			search(map);
//		}else if(Input ==3) {
//			// ��ü����
//			showInfo(map);
//		}else if(Input == 4) {
//			// ����
//			
//		}else 

		/////////////
		Scanner scanner = new Scanner(System.in);

//		menu = scanner.nextInt();

		while (true) {
			System.out.println("�߰� 0, ���� 1, ã�� 2, ��ü���� 3, ���� 4");
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
				System.out.println("���α׷��� �����մϴ�.");
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
