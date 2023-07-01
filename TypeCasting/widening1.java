package TypeCasting;

public class widening1 {

	public static void main(String[] args) {
		
		byte b = 100;
		short s = (byte)b;
		int i = (int) s;
		double d= (double)i;
		float f= (float)d;
		long l = (long )f;
		System.out.println(l);
	}
}
