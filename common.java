class Mythri
{
	public static void main(String args[])
	{
	Mythri c=new Mythri();
	c.com(new int[]{10,30,20},new int[]{10,20,30});
	}
	void com(int a[],int b[])
	{
		int count=0;
		if(a.length==b.length)
		
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=b.length-1;y++)
			{
			 if(a[x]==b[y])
			{
				count++;
			}
			}
		}
	              if(count==a.length-1)
			{
				System.out.println("anagram");
			}

			else
			{
				System.out.println("not an anagram");
			}

	}
}
		