package String_Class;

public class Methods_of_String {

	public static void main(String[] args) {
		String s= "Arpit Brur";
		String s1= "  java Developer      ";
		String s2= "Arpit Brur is a developer";
		String s3="QSpider";
		
		
		// method of upper case:- it will convert all the word into upper case.
		System.out.println(s.toUpperCase());
		
		//method of lower case :-it will convert all the word into Smaller case.
		System.out.println(s.toLowerCase());
		
		// method of CharAt(int index):- it will 
		System.out.println(s.charAt(0));
		
		// method of length;- it will count the length of sentence.
		System.out.println(s2.length());
		
		// method of trim;- it will remove space front and the back of the sentence.
		System.out.println(s1.trim());
		
		// method of Substring:- 
		System.out.println(s3.substring(0,4));
		
		//method of tocharArray():-
		String s4= "Manmohan";
		String rev= "";
		char ch[]=s4.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println(" ");
		
		
		
		// method of equalIgnoreCase
		
		String s5="java program";
		String s6= "JAVA PROGRAM";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		
		// replace method 
		
		String s7= "java program";
		System.out.println(s7.replace("java", "python"));
	}
}
