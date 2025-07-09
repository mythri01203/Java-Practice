 class Mythri
{
	public static void main(String args[])
	{
		Mythri o=new Mythri();
		o.ch(new char[]{'A','C','b','h','e','i'});
	}
	void ch  (ch a[])
	{
		boolean b[]=new boolean[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			int count=1;
			if(b[x]==true)
			continue;
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]==a[y])
			{
				count++;
				b[y]=true;
			}
		}
		if(ch>='A'&& ch<='Z')	
		{
			System.out.println(ch+" "+a[x]);	
		}
		}
	}
}
