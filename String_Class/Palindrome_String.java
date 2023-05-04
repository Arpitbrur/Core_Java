package String_Class;

public class Palindrome_String {

	public static void main(String[] args) {
		String s= "dad";
		String rev="";
		char ch[]= s.toCharArray();
		for(int i=ch.length-1;i>=0; i--) {
			rev = rev+ch[i];
		}
		if(rev.equals(s)) {
			System.out.println("Palidrome String");
		}else {
			System.out.println(" Not palindrome String");
		}

	}

}
