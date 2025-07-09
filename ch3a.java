class Main
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,5,6,7,8,9,10};
		int search=5,count=0,element=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]==search)
			{
				count++;
				element=a[x];
				
			}
		}
		System.out.println(element+" "+count);
	}
}