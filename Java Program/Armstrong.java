class Armstrong 
{
	public static void main(String[] args) 
	{
		int n = 346;
		int temp = 0;
		temp = n%10; // first digit
		int b = temp;
		int c = n/10;
		int td=c/10; // third
		int mid = c%10;// mid
		 int rev = (temp*100 + mid*10 +td*1); 
		 
		
			System.out.println(rev);
		
	}
}
