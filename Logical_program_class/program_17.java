package Logical_program_class;

public class program_17 {

	public static void main(String[] args) {
		int rev=0;
		int num=1234;
		while(num>0) {
			int rem=num%10;
			rev= rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

}
