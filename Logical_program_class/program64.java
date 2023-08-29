package Logical_program_class;

public class program64 {
	public static void main(String[] args) {
	
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int i=3;
		while(i<=15) {
			int c= a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			i++;
		}
}
}
