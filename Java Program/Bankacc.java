class Bankacc
{
	public static void main(String[] args) 
	{
		int balance=1000;
		int pwd=123;
		int withdraw=500;
	    if(pwd==123)
	   {
		if (withdraw>=balance)
		{
			System.out.println("john you can withdraw your money");
		}
		else
		{
			System.out.println("john you cannot withdraw your money");
		}
	   }
	}
}