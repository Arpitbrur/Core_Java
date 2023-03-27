import java.util.Scanner;
class Divby3
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		 int i= s.nextInt();
		if(i%3==0)
		{
			if(i%5==0)
			{
				System.out.println(i  + "is divisible by 3 and 5");
			}
			else
			{
				System.out.println(i+ "is not divisible by 3 and 5");
			}
		}
	}
}
