import java.util.Scanner;
class Factor
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number - ");
		int i = s.nextInt();
		for(int j = 1; j<=i; ++j)
		{
			if(i%j==0)
			{
			System.out.println(j);
			}
		}
			
	}
}
