package looping;
import java.util.Scanner;
public class prime {
	
		public static void main(String[] args) 
		{ 
			int count=0;
			Scanner S=new Scanner(System.in);
			System.out.println("Enter a value");
			int num= S.nextInt();
			for (int i = 2; i < num; i++) {
				if(num%2==0) {
					count++;
				}
			}
			if (count==0)
				System.out.println(num+ "is a prime number");
			else
				System.out.println(num+"is not a prime number");
		}
	}


