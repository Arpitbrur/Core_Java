// 41.CHECK WHETHER THE NO IS PERFECT NO OR NOT.
package Logical_program_class;
import java.util.Scanner;

public class program_41 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num =scanner.nextInt();
		int sum =0;
		for(int i =1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println(num+":- is perfect number");
		}else {
			System.out.println(num +":- is not perfect number");
		}
	}
}
