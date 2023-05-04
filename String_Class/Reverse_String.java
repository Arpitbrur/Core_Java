package String_Class;

public class Reverse_String {

	public static void main(String[] args) {
		String s4= "Manmohan";
		String rev= "";
		char ch[]=s4.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i]);
//		}
		for(int i=ch.length-1; i>=0; i--) {
			rev= rev+ch[i];
		}
		System.out.println(rev);
	}


	}


