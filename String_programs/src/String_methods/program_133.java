package String_methods;
// 133.WAP TO REVERSE THE WORD IN A STRING.
public class program_133 {

	public static void main(String[] args) {
		String s1 = "Java is programming language";
		String s2[] = s1.split(" "); 
		for (String s3 : s2) {
			String rev= " ";
			char ch[]= s3.toCharArray();
			for(int i =ch.length-1; i>=0; i--) {
				rev = rev+ch[i];
			}
			System.out.print(rev);
		}
	}
}
