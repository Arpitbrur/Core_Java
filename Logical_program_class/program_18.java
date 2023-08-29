// 18.WAP TO PRINT EVEN DIGITS IN A NUMBER
package Logical_program_class;

public class program_18 {
	public static void main(String[] args) {
		int num = 2345678;
		int last = 0;
		int sum =0;
		
		while(num>0) {
			last =num%10;
			num = num/10;
			if(last%2==0) {
//				sum =sum+last;
				System.out.println("even number is:- "+last);
			}			
		}
//		System.out.println(sum);
	}
}
