class Main
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		int temp=0;
		for(int x=a.length-1;x>=0;x--)
		{
			 temp=a[a.length-1];
			a[x]=a[x-1];
		System.out.println(a[x]);
		}
		a[0]=temp;
		//stem.out.println(a[x]);
	}

}