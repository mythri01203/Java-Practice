class Main
{
	public static void main(String args[])
	{
		int a[]={12,56,34,23,67,76,32,75,90,345};
		for(int x=0;x<a.length-1;x+=2)
		{
			int temp=a[x];
			a[x]=a[x+1];
			a[x+1]=temp;
		}
		for(int temp1:a)
		System.out.println(temp1);
	}
}