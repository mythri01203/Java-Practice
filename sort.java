class Main
{
	public static void main(String args[])
	{
	int a[]={7,2,1,6,9,3};
	for(int x=0;x<=a.length-1;x++)
	{
		for(int y=x+1;y<=a.length-1;y++)
		{
			if(a[x]>a[y])
			{
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			}
		}
	
	System.out.println(a[x]);
	}
	}
}