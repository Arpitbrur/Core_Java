package String_Class;

public class reverse_word_String {

	public static void main(String[] args) {
		String s= "java is a programming language";
		String s1[]=s.split(" ");
		for (String s2 : s1) {
			String rev="";
			char ch[]= s2.toCharArray();
			for(int i=ch.length-1; i>=0; i--) {
				rev = rev+ch[i];
			}
			System.out.print(rev+" ");
		}

	}

}
