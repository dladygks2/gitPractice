package ch03;

public class GenericPrinter<T> {

	// T라는 대체 문자를 사용한다. T = 임시값, 아무것이나 들어올 수 있다는 의미
	// E - element, K - key, V - value
	// 자료형 매개변수(type parameter)
	
	private T material;
	
	//getter
	public T getMaterial() {
		return material;
	}
	
	//setter
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString method override
	@Override
	public String toString() {
			
		return material.toString();
	}
	
	
	
	
	
}
