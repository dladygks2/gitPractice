package ch11;

public class StringTest3 {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		System.out.println("±¸ºÐÀÚ-------------");
		
		builder.append(android);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
	}
}
