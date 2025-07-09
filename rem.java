class Mythri
{
	public static void main(String args[])
	{
	String s="a quick brown fox jumps over lazy dog",s1="";
	int count=0;
	for(char c='a';c<='z';c++)
	{
		count=0;
		for(int x=0;x<=s.length()-1;x++)
		{
			char let=s.charAt(x);
			if(let==c)
			{
			count++;
			//break;
			}
		}
			if(count==0)
			s1=s1+c;
	 }
	if(s1.length()==0)
	System.out.println("all alphabets are there");
      
        else
       	System.out.println("missing alphabets are:"+s1);
        }
}

		