abstract class bank
{
	public abstract void branch_code();	
	public abstract void pwd();
	public abstract void location();
}
	class ludo extends bank
	{
		@Override
			public void branch_code()
		{
			System.out.println("ABC Panipat");
		}
	@Override
		public void pwd()
		{
			System.out.println(123);
		}
		@Override
		public void Loaction()
		{
			System.out.println("noida");
		}
	}
	class jspider
	{
		public static void main(String [] arg)
		{
			ludo l= new ludo();
			l.branch_code();
			l.pwd();
			l.Location();
		}
	}