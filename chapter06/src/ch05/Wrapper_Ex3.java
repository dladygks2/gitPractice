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
		System.out.println("bool : " + bool); // ���� �ȸ����� 'false'�� �ȴٴ� ��.
		System.out.println("bool2 : " + bool2); // ���� �ȸ����� 'false'�� �ȴٴ� ��.
		
		if(Boolean.parseBoolean(str3)) {
			System.out.println("boolean ������ �����");
		}
		
		System.out.println("Float : " + f);
		
		// ���� 1)
		
		String str10 = "1001";
		String str11 = "2001";
		
		//str10�� str11�� ��������
		
		int i10 = Integer.parseInt(str10);
		int i11 = Integer.parseInt(str11);
		
		System.out.println("���� : " + (i10 + i11) );
		System.out.println("���� : " + (i10 * i11) );
		
		
		
		
		
		
		System.out.println("���ڿ� byte�� ��ȯ : " + b);
		System.out.println("���ڿ� int�� ��ȯ : " + i);
		System.out.println(b);
		
		
		
	}
	
}
