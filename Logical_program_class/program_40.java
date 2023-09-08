// 40.WAP TO CALCULATE SUM OF ALL THE NOS WHICH IS PRESENT IN 20 TO 60 AND NO SHOULD BE DIVISIBLE BY ONLY 11.

package Logical_program_class;

public class program_40 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=20; i<=60; i++) {
			if(i%11==0) {
				sum=sum+i;			
			}
		}
		System.out.println("sum of all the number b/w 20 to 60 & should be devisible by 11:--   "+sum);
	}
}
