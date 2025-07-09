 class Mythri
{
	public static void main(String args[])
	{
		Mythri o=new Mythri();
		o.unique(new int[]{12,40,78,9,4});
	}
	void unique(int a[])
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
		if(count==1)
			System.out.println(a[x]+"=>"+count);
		}
	}
}
