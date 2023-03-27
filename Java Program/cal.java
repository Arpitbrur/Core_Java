import java.util.Scanner;
class Cal  
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the Second number");
	    int b=s.nextInt();
		System.out.println("Enter the choice");
		int c=s.nextInt();
		switch (c)
		{
		    case 1:
			{
				System.out.println(a+b);
			}
			break;
			case 2:
			{
				System.out.println(a-b);
			}
			break;
			case 3:
			{
				System.out.println(a*b);
			}
			break;
			case 4:
			{
				System.out.println(a/b);
			}
			break;
			default:
			{
				System.out.println("invalid");
			}
		
		}
	}
}
