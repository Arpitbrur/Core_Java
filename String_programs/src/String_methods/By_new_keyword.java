package String_methods;

public class By_new_keyword {

	public static void main(String[] args) {
		
		String s1 = new String("Mohan");
		String s2 = "Mohan";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3 = new String("Mohan");
		System.out.println(s1.equals(s3));
		if(s1.equals(s3)) {
			System.out.println("if block");
		}else {
			System.out.println("else block");
		}
	}
}
