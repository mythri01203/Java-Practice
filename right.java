class Main
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		Main main=new Main();
		main.left(a);	
	}
void left(int a[])
{
	for(int x=0;x<=a.length-1;x++)
	{
		int y, temp=a[a.length-1];
		for(y=a.length-2;y<0;y--)
		{
			a[y]=a[y-1];
			System.out.println(a[y]);
		}
		a[0]=temp;
	
	System.out.println(a[0]);
	System.out.println();
	}
}
}