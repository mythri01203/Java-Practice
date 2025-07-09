class Main
{
	public static void main(String args[])
	{
		int a[]={12,56,34,23,67,76,32,75,90,345};
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]<a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		for(int temp1:a)
		System.out.println(temp1);
	}
}