// 19.WAP TO PRINT ODD DIGITS IN A NUMBER
package Logical_program_class;

public class program_19 {
	public static void main(String[] args) {
		int num = 12328;
		int last = 0;
		
		while(num>0) {
			last =num%10;
			num = num/10;
			if(last%2!=0) {
				System.out.println(last);
			}			
		}
	}
	
}
