class Main
{
	public static void main(String args[])
	{
		int a[]={10,25,20,5,40};
		for(int x=0;x<a.length-2;x++)
		{
			for(int y=0;y<(a.length-1-x);y++)
			{
				if(a[y]>a[y+1])
				{
					int temp=a[y];
					a[y]=a[y+1];
					a[y+1]=temp;
				}
			//System.out.println(a[y]);
			}
			//System.out.println(a[y]);
		}
		for(int temp:a)
		{
			System.out.println(temp);
		}
		
	}
}