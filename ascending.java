class Main
{
	public static void main(String args[])
	{
		int a[]={10,40,20,90,30,60};
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