package String_Class;

public class Method_of_Split {

	public static void main(String[] args) {
		String s= "java is a programmimg language";
		String s1[]=s.split(" ");
		String upper="";
//		for (int i = 0; i < s1.length; i++) {
//			System.out.println(s1[i]);
//		}
		for (String s2 : s1) {
			//System.out.println(s2);
			String first=s2.substring(0, 1);
			String afterFirst= s2.substring(1);
			upper=upper+first.toUpperCase()+afterFirst+" ";
			
		}
		System.out.println(upper);
	}

}
