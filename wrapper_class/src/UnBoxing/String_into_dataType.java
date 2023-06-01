package UnBoxing;

public class String_into_dataType {

	public static void main(String[] args) {
		// if we want to convert string into any other data type then we use parseInt().
		String S1 = "32434545";
		String S2 = "25435.656";
		System.out.println(S1+S2);
		System.out.println("======================");
		int i = Integer.parseInt(S1);
		System.out.println(i);
		double d = Double.parseDouble(S2);
		System.out.println(d);
		System.out.println("====================");
		String S3 ="true";
		boolean b = Boolean.parseBoolean(S3);
		System.out.println(b);
	}
}
