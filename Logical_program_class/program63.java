package Logical_program_class;

public class program63 {

	public static void main(String[] args) {
		for(int j=1; j<=100; j++) {
			int n=j;
			int i=2;
			int count =0;
			while(i<=n/2) {
				if(n%i==0) {
					count++;
				}
				i++;
			}
			if(count==0 && n>1) {
				System.out.println("prime number"+j);
			}
		}
	}
}
