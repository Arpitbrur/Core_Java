package looping;

import java.util.Scanner; 
public class sumofeven {


		public static void main(String[]args) {
		
			Scanner S=new Scanner(System.in);
			System.out.println("Enter a number");
			int a =S.nextInt();
			int sum=0,num=1;

			for(int count=1; count<=a;)
			{
				if(num%2==0)
				{
				sum+=num;
				count++;
				}
				num++;
			}
			System.out.println("Sum:"+sum);
		}
	}



