class shopkeeper
{
	public static void main(String[] args) 
	{
		int milkshake_cost=25;
		int cake_cost=30;
		int chocholate=15;
		int Smith=10;
		int Jack=5;
		int sum=(Smith+Jack);
		switch(sum)
			
		{
			case 25:
			{
			System.out.println("You can buy milkshake");
			}
		    case 30:
			{
			System.out.println("You can buy cake");
			}
			case 15:
			{
			System.out.println("You can buy chocholate");
			}
			break;
			default:
			{
				System.out.println("You cannot buy anything");
			}
		}
	}
}
