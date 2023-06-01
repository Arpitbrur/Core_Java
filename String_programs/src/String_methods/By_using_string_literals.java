package String_methods;

public class By_using_string_literals {

	public static void main(String[] args) {
		String s1 = "Mohan";
		String s2 = "Sohan";
		String s3 = "mohan";
		String s4 = "Mohan";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}
