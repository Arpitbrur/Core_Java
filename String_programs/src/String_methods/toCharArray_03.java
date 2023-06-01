package String_methods;

public class toCharArray_03 {

	public static void main(String[] args) {
		String s1 = "Mohan i5s h34app4y";
		int count = 0;
		char p[] = s1.toCharArray();
		for (char c : p) {
			//System.out.println(c);
			count++;
		}
		System.out.println("length of String is:-"+count);
	}
}
