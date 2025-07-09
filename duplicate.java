 class Mythri
{
	public static void main(String args[])
	{
		Mythri o=new Mythri();
		o.unique(new int[]{12,40,78,9,40,12});
	}
	void unique(int a[])
	{
		boolean b[]=new boolean[a.length];
		int max=0;
		for(int x=0;x<=a.length-1;x++)
		{
			int count=0;
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
		if(count>1)	
		{
			if(a[x]>max)
			max=a[x];
		}
			
		}
			System.out.println(max);

	}
}
