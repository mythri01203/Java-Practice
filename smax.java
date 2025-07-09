class Main
{
	public static void main(String args[])
	{
	int a[]={1,4,6,8,13,56,98};
	int fmax=0;
	int smax=0;
	for(int x=0;x<=a.length-1;x++)
	{
		if(a[x]>fmax)
		{
			 smax=fmax;
			fmax=a[x];
		}
		else if((a[x]<fmax)&&(a[x]>smax))
			smax=a[x];
	}
	System.out.println(smax);
	
	}
}