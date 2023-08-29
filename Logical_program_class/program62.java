package Logical_program_class;

public class program62 {
	
	public static void main(String[] args) {
		
		// (1,n)=> (count=2)
		// (2,n/2)=>(count=>0)
		// (1,n/2)=> (count =>1)
		
		int a =15;
		int i = 2;
		int count =0;
		while(i<=a/2) {
			if(a%i==0) {
				count++;
			}
			i++;
		}
		if(count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("Not prime number");
		}
		
	}
}
