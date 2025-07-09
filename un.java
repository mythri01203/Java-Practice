class Main
{
	public static void main(String args[])
	{
	int a[]={10,20,30,40,10,20};
	int b[]=new int[a.length];
	for(int x=0;x<=a.length-1;x++)
	{
		int count=0;
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
		//if(count>0)
		System.out.println(a[x]+" "+count);
	}
	}
}