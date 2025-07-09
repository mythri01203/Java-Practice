class Mythri
{
	public static void main(String args[])
	{
		Mythri o=new Mythri();
		int[] res=o.sorting(new int[]{12,40,78,9,4});
		for(int x=0;x<=res.length-1;x++)
		System.out.println(res[x]);
		String res1=o.binarySearch(res,13);
		System.out.println(res1);
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
	String binarySearch(int a[],int search)
	{
		int f=0,l=a.length-1,m;
		while(f<=l)
		{
			m=(f+l)/2;
			if(search == a[m])
			{
				return "elements found";
			}
			else if(search > a[m])
			{
				l=m-1;

			}
			else
			{
				f=m+1;
			}
		}

		return "elements not found";
		
	}
}