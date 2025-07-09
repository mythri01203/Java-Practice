class Main
{
	public static void main(String args[])
	{
		int c[]={10,20,30,40,50,60,70};
		int d[]=new int[c.length];
		Main m=new Main();
		int temp[]=m.mix(c,d);
		for(int x:temp)
		
		System.out.println(x);
	}
	int[] mix(int a[],int b[])
	{
		//int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			if(x==0)
			{
				b[x]=a[x]+a[x+1];
			}
			else if(x==a.length-1)
			{
				b[x]=a[x]+a[x-1];
			}
			else
			{
				b[x]=a[x-1]+a[x+1];
			}
		//return b;
		}
		return b;
	}
}

			