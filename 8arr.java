class Main
{
	public static void main(String args[])
	{
		int a[]={12,56,34,23,67,76,32,75,90,345};
		int n=a.length;
		int mid=n/2;
		for(int x=0;x<mid-1;x++)
		{
			for(int y=x+1;y<mid;y++)
			{
				
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
				
			}
		}
		for(int x=mid;x<n-1;x++)
		{
			for(int y=x+1;y<n;y++)
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