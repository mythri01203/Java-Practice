class Mythri
{
	public static void main(String args[])
 	{
		String s="Hello";
		String s1="";
		for(int x=0;x<=s.length()-1;x++)
		{
			char c=s.charAt(x);
			if(c>='A'&&c<='Z')
			{
				s1=s1+(char)(c+32);
			}
			else if(c>='a'&&c<='z')
			{
				s1=s1+(char)(c-32);
			}
		}
		System.out.println(s1);
	}
}