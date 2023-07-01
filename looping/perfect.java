package looping;
import java.util.Scanner;
public class perfect {
	
		public static void main(String[] args)
		{
			int sum = 0;
			Scanner S=new Scanner(System.in);
			System.out.println("enter the number");
			int n=S.nextInt();
			for(int i=1;i<n;i++)
			{   
				if(n%i==0)
				{
				sum= sum+i;
				}
			}
			if(n==sum)
				System.out.println(n+" is a perfect number");
			else
				System.out.println(n+
						" is not a perfect number");
		}
	}



