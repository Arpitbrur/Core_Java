// 34.CALCULATE THE SUM OF SQUARE OF EACH DIGIT IF DIGIT IS EVEN IN A NUMBER.
package Logical_program_class;
import java.util.Scanner;
public class program_34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = scanner.nextInt();
		int square =1, rem=1, sum =0;  //1234
		while(num>0)
		{
			rem = num%10;
			if(rem%2==0)
			{
				square = rem*rem;
				sum =sum+square;
			}

			num = num/10;
		}
		System.out.println(sum);

		
	}
}
