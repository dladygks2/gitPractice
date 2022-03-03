package ch05;

public class Fruits {
	String name;
	int price;
	int fresh;

//	public Fruits(String name, int price, int fresh) {
//		this.name = name;
//		this.price = price;
//		this.fresh = fresh;
//
//	}

	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("price : " + price);
		System.out.println("fresh : " + fresh);
	}
}