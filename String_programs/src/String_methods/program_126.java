package String_methods;
// 126.WAP TO COUNT THE CHARACTERS PRESENT IN STRING WITHOUT USING LENGTH().
public class program_126 {

	public static void main(String[] args) {
		String s1 = "java is programming language";
		char ch[]= s1.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			count++;
		}
		System.out.println("no of character in string:- "+count);
	}
}
