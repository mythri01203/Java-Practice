class Main
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8};
		int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]%2==0)
			{
				b[x]=a[x];
				System.out.println(b[x]);
			}
		}
	}
}