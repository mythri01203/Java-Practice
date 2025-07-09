class Main
{
	public static void main(String args[])
	{
		String s="hello all good morning";
		String s1="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				
				s1=s1+ch;
			}
		}
		System.out.println(s1);
	}
}