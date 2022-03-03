package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		// 8 + "" --> String
//		int a = "1";
		
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		// 
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		
		boolean bool = Boolean.parseBoolean(str2);
		boolean bool2 = Boolean.parseBoolean(str3);
		System.out.println("bool : " + bool); // 형이 안맞으면 'false'가 된다는 듯.
		System.out.println("bool2 : " + bool2); // 형이 안맞으면 'false'가 된다는 듯.
		
		if(Boolean.parseBoolean(str3)) {
			System.out.println("boolean 형으로 변경됨");
		}
		
		System.out.println("Float : " + f);
		
		// 문제 1)
		
		String str10 = "1001";
		String str11 = "2001";
		
		//str10과 str11을 덧셈연산
		
		int i10 = Integer.parseInt(str10);
		int i11 = Integer.parseInt(str11);
		
		System.out.println("덧셈 : " + (i10 + i11) );
		System.out.println("곱셈 : " + (i10 * i11) );
		
		
		
		
		
		
		System.out.println("문자열 byte값 변환 : " + b);
		System.out.println("문자열 int값 변환 : " + i);
		System.out.println(b);
		
		
		
	}
	
}
