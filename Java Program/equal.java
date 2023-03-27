import java.util.Scanner;
class Equal
{
	public static void main(String[] args) 
	{
		Scanner	s=new Scanner(System.in);
		System.out.println("Enter a First number");
		int a=s.nextInt();
		System.out.println("Enter a Second number");
		int b=s.nextInt();
		if(a==b)
		{
			System.out.println("it is equal number");
		}
		else
		{
			System.out.println("it is not equal number");
		}
	}
}
