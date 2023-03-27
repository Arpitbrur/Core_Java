import java.util.Scanner;
class Double4
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int i=s.nextInt();
		System.out.println("Enter the value");
		double d=s.nextDouble();
		System.out.println("Enter the value");
		long l=s.nextLong();
		System.out.println("Enter the value");
		short s1=s.nextShort();
		System.out.println("Enter the value");
		char c=s.next().charAt(0);
		System.out.println("Enter the value");
		byte b=s.nextByte();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s1);
		System.out.println(l);
		System.out.println(c);
		System.out.println(b);
	}
	
}
