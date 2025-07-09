class Mythri
{
	public static void main(String args[])
	{
		Mythri o=new Mythri();
		int[] res=o.delete(new int[]{1,4,3,9,10,8,2},3);
		for(int x=0;x<=res.length-1;x++)
		System.out.println(res[x]);
	}
	int[] delete(int a[],int index)
	{
		for(int i=index;i<a.length-1;i++)
		{
		a[i]=a[i+1];
		}
		a[a.length-1]=0; 
		return a;
	}
}