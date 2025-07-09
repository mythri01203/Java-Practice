class Main
{
	public static void main(String args[])
	{
	int a[]={10,30,28,30,40,28,40,40,9};
	int b[]=new int[a.length];
	int min=Integer.MAX_VALUE,minn=0,smin=0;
	for(int x=0;x<=a.length-1;x++)
	{
		int count=1;
		if(b[x]==1)
		continue;
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]==a[y])
			{
				count++;
				b[y]=1;
			}
		}
			if(count==1)
			{
				if(a[x]<min)
				{
					smin=min;
					min=a[x];
					//min=minn;
				}
				else if(a[x]<smin)
				{
					smin=a[x];
				}
			
			}
	}
		System.out.println(min);
	}
}
