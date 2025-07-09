class Sain
{
	public static void main(String args[])
	{
		String s="hello";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			for(int y=x+1;y<s.length();y++)
			{
				s1=s.substring(x,y);
				if(!(s1.contains("a")||s1.contains("e")||s1.contains("i")||s1.contains("o")||s1.contains("u")))
				{
					System.out.println(s1);
				}
			}
		}
	}
}