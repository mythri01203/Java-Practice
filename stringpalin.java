class Mythri
{
	public static void main(String args[])
 	{
		String s="madam";
		String s1="";
		for(int x=s.length()-1;x>=0;x--)
		{
			char c=s.charAt(x);
			s1=s1+c;
		}
		System.out.println(s.equals(s1)?"palindrome":"not palindrome");
		System.out.print(s1);
	}
}