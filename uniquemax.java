class Main
{
	public static void main(String args[])
	{
		int a[]={10,20,20,30,20,40,50,30,70};
		int b[]=new int[a.length];
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE,smaxe=0;
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
			if(a[x]>max)
			{
				max=a[x];
				smaxe=count;
			}
			/*else if(count<max && count>smax)
			{
				smax=count;
				smaxe=a[x];
			}*/
		}
		}
		System.out.println(smaxe+"-->"+max);
		
	}
}