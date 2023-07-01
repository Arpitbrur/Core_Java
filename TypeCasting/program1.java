package TypeCasting;

public class program1 {

	public static void main(String[] args) {
		int i= 10;
		byte b = (byte)i;  // narrowing
		short s= b;  // widening
		long l = s;   // widening
		int j = (int)l;   // narrowing
		
		System.out.println(j);
	}

}
