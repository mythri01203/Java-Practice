class Mythri
{
	public static void main(String args[])
	{
		Mythri o=new Mythri();
		int[] res=o.sorting(new int[]{10,40,30,60,30});
		for(int x=0;x<=res.length-1;x++)
		System.out.println(res[x]);
	}
	int[] sorting(int a[])
	{
		for(int x=0;x<=a.length-2;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]<a[y])  //10<40
				{
				int temp=a[x];  //temp=10
				a[x]=a[y];      //
				a[y]=temp;
				}
			}
		}
		return a;
		
	}
}