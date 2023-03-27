import java.util.Scanner; 
class sumofeven
{
	public static void main(String[]args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a number");
		int a =S.nextInt();
		//int sum=0,num=1;
		int i, sum=0;
		for(i=2;i<=a;i+=2)
		//for(int count=1; count<=a;)
		{
			sum+=i;
			//if(num%2==0)
			//{
			//sum+=num;
			//count++;
			//}
			//num++;
		}
		System.out.println("Sum:"+sum);
	}
}
