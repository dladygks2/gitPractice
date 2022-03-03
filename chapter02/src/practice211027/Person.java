package practice211027;

public class Person {

	double height;
	double weight;
	String name;
	int age;
	String sex;
	
	public Person(double height, double weight, String name, int age, String sex) {
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.age = age;
		this.sex = sex;
		
	}
	
	public String showInfo() {
		return "키가 " + height + "cm이고, \n몸무게가 " + weight + "kg인 \n" + sex + "이 있습니다.\n이름은 " 
	+ name + "이고, \n나이는 " + age + "세 입니다." ;
	}
	
	
}

