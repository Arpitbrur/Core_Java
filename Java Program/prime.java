import java.util.Scanner;
class prime 
{
	public static void main(String[] args) 
	{
		int num, i=2, count=0;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a value");
		num= S.nextInt();
		while(i<num)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if (count==0)
			System.out.println(num+ "is a prime number");
		else
			System.out.println(num+"is not a prime number");
	}
}
