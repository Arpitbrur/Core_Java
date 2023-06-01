package String_methods;
// 132.WAP TO CHECK WHETHER STRING IS PALINDROME OR NOT.
public class program_132 {

	public static void main(String[] args) {
		String s1 = "dad";
		char ch[]= s1.toCharArray();
		String rev = "";
		for (int i = ch.length-1; i>=0; i--) {
			rev = rev+ch[i];
		}
		if(rev.equals(s1)) {
			System.out.println("palindrom");
		}else {
			System.out.println("not");
		}
	}
}
