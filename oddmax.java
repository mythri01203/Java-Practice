class Main
{
	public static void main(String args[])
	{
	int a[]={10,30,28,30,40,28,40,40,9,9,11,11,11};
	int b[]=new int[a.length];
	int smin=Integer.MIN_VALUE,minn=0,maxe=0;
	int max=Integer.MIN_VALUE;
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
			if(count>1&&a[x]%2!=0)
			{
				if(count>max)
				{
					smin=max;
					max=count;
					maxe=minn;
					minn=a[x];
				}
				else if(count<max&&count>smin)
				{
					smin=count;
					maxe=a[x];
				}
			
			}
	}
		System.out.println(maxe+" "+smin);
	
	}
}
