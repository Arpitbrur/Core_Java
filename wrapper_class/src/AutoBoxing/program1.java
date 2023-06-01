package AutoBoxing;

public class program1 {
	public static void main(String[] args) {
		int i =10;
		Integer j = i;
		Integer k = Integer.valueOf(i);
		System.out.println(k);
		System.out.println(j+100);
		System.out.println(i+100);
		System.out.println("================");
		
	}
	
}
