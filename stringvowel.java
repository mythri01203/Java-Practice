class Main
{
	public static void main(String args[])
	{
	String s=new String("hello");
	for(int x=0;x<s.length();x++)
	{
		char ch=s.charAt(x);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch);
		}
	}
	}
}