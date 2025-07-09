class Main
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		Main m=new Main();
		m.delete(a);
	}
void delete(int a[])
{
	int index=2;
	a[index]=0;
	for(int x=index;x<a.length-1;x++)
	{
		a[x]=a[x+1];
	}
	a[a.length-1]=0;
	for(int x=0;x<a.length-1;x++)
	{
		System.out.println(a[x]+" ");
	}
}
}