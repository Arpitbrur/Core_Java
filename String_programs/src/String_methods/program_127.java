package String_methods;
// 127.WAP TO CONVERT UPPERCASE TO LOWER CASE WITHOUT USING IN BUILT METHOD.
public class program_127 {

	public static void main(String[] args) {
		String s1 = "ARPITBRUR";
		char ch[] = s1.toCharArray();
		String upper = "";
		for (int i = 0; i < ch.length; i++) {
				char c = (char)(ch[i]+32);
				upper = upper+c;
		}
		System.out.println(upper);

	}
}
