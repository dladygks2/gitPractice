package ch03;

public class GenericPrinter2<T extends Material> {
	
	
	private T material;

	// 알트 시프트 s키
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	

}
