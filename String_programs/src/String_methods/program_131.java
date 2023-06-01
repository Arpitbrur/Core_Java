package String_methods;
// 131.WAP TO REVERSE THE STRING.
public class program_131 {

	public static void main(String[] args) {
		String s1 = "monday is super";
		char ch[]= s1.toCharArray();
		String rev =" ";
		for (int i = ch.length-1; i >=0; i--) {
			rev = rev+ch[i];
		}
		System.out.println(rev); 
		
	}
}
