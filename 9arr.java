class Main
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8};
		int n=a.length;
		int mid=n/2;
		for(int x=1;x<mid-1;x+=2)
		{
			for(int y=x+2;y<mid;y+=2)
			{
				
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
				
			}
		}
		for(int x=0;x<n-1;x+=2)
		{
			for(int y=x+2;y<n;y+=2)
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