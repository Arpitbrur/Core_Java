class vowelconsonents
{
	public static void main(String[] args) 
	{
		 int vcount=0;
		 int ccount=0;
		 String s="hello this a boy";
		 String(toLowercase());
		for(int i=0; i<s.length();i++)
			if(s.charAt(i)=='a'||
			s.charAt(i)=='e'||
			s.charAt(i)=='i'||
			s.charAt(i)=='o'||
			s.charAt(i)=='u')
		{
			System.out.println("the number of vowels=  "+vcount++);
		}
			else
				System.out.println("the number of consonents=  "+ccount++);
		
	}
}
