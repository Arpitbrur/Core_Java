class count
{
	public static void main(String [] args)
	{
		int num= 1234567887;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("the number of digit is=" + count);

	}
}