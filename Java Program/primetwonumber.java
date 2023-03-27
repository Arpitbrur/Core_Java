import java.util.Scanner;
class primetwonumber
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("=======Enter the first number=======");
		int m= sc.nextInt();
		System.out.println("=======Enter the second number=======");
		int n= sc.nextInt();
		int i=1;
		while(i<=m)
		{
			if(m%i==0)
			{
				count++;
			}
		}
			

	}
}
