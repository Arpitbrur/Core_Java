import java.util.Scanner;
class demo
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=S.nextInt();
		int count = 0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
	}
}
