class Main
{
	public static void main(String args[])
	{
		String s="a man, a plan a canal 1 panama";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c>='a'&&c<='z')
			{
				s2=s2+c;
			}
		}
		StringBuffer sb=new StringBuffer(s2);
		StringBuffer s1=sb.reverse();
		System.out.println(s1);
		System.out.println((s2.contentEquals(s1))?"palindrome":"not a palindrome");
	}
}
