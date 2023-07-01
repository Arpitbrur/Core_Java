package TypeCasting;

public class narrowing {

	public static void main(String[] args) {
		long l = 1123244;
		float f=(float)l;
		double d= (double)f;
		int i = (int)d;
		short s =(short)i;
		byte b = (byte)s;
		char c = (char)b;
		
		System.out.println(b);
	}
}
