class Main
{
	public static void main(String args[])
	{
		String s="hello all goood morning";
		String s1[]=s.split(" ");
		int count=0,max=0;
		String word="";
		for(int x=0;x<s1.length;x++)
		{
			count=0;
			for(int y=0;y<s1[x].length();y++)
			{
				char c=s1[x].charAt(y);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				{
					count++;
				}
			
			}
			if(count>max)
			{
				max=count;
				word=s1[x];
			}
		}
			System.out.println(word+" "+max);
		
	}
}