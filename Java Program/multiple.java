import java.util.Scanner;
class Multiple 
{
	public static void main(String[] args) 
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the value");
		int num=S.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"*"+i+"="+ num*i);
		}
	}

}
