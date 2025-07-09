class Main
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
				if(!(s1=="a")||(s1=="e")||(s1=="i")||(s1=="o")||(s1=="u"))
				{
					System.out.println(s1);
				}
			}
		}
	}
}