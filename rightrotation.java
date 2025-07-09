class Mythri
{
	public static void main(String args[])
	{
		Mythri o=new Mythri();
		int[] res=o.rightRotation(new int[]{10,40,30,60,30});
		for(int x=0;x<=res.length-1;x++)
		System.out.println(res[x]);
	}
	int[] rightRotation(int a[])
	{
		int temp=a[a.length-1];
		for(int x=a.length-2;x>=0;x--)
		{
			a[x+1]=a[x];

		}
			a[0]=temp;
		return a;
	}
	
}

		
