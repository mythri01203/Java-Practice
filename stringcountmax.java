class Main
{
	public static void main(String args[])
	{
		String s="helloh";
		String s1="";
		int max=0;
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			int count=0;
			for(int y=0;y<s.length();y++)
			{
				if(s.charAt(y)==ch)
				{
					count++;
					max=count;
				}
			}
		}
			System.out.println(max);

	}
}