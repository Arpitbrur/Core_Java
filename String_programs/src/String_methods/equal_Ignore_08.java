package String_methods;

public class equal_Ignore_08 {

	public static void main(String[] args) {
		String s1 = "manmohan";
		String s2 = "ArPit";
		String s3 = "ManmoHan";
		String s4 = "arpit";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s3.equalsIgnoreCase(s1));
	}
}
