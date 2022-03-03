package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		
		// 한번 생성된 String은 불변(immutable)이다.
		
		// String을 연결하면 기존의 String 에 연결되는 것이 아닌
		// 새로운 문자열이 생성된다.
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));	// heap 메모리의 번지값(주소값 같은거)
		
		System.out.println("--------------------------------------");
		
		// java = java + android;
		java = java.concat(android);  // 연결 해주겠다는 메서드이다. concat
		System.out.println(java); 	// javaandroid
		
		// String은 불변이기 때문에 바꾸면 새로 만든다고 봐야하네
		System.out.println(System.identityHashCode(java));
		// String은 메모리 낭비가 심해서 다른 방법을 주로 사용
		
		
		
	}
}
