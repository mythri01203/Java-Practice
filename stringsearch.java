class Main
{
	public static void main(String args[])
	{
		String s="hello";
		char search='g';
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c==search)
			{
				count++;
			}
		}
		System.out.println((count>0)?"found":"not found");
	}
}