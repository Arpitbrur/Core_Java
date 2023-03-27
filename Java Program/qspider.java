class qspider
{
	public static void main(String[]args)
		{
			int i='K';
			byte b= (byte)i; //narrowing
			short s = b;//widening
			long l = s;//widening
			float f= l;//widening
			double d= f;//widening
			char c =(char) d;//narrowing
			System.out.println(c);
		}
}