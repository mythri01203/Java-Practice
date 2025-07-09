class Main
{
	public static void main(String args[])
	{
		String s="hello ";
		String s1[]
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}