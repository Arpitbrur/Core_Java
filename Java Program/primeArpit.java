import java.util.Scanner;
class primeArpit 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=S.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
				System.out.println("prime number");
			else
				System.out.println(" not prime number");
		
	}
}
