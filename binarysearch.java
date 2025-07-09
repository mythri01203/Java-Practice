class Main
{
	public static void main(String args[])
	{
	int a[]={10,20,30,40,50,60,70};
	int search=20;
	int low=0,high=a.length-1,mid=0;
	while(low<=high)
	{
		mid=(low+high)/2;
		if(a[mid]>search)
			high=mid-1;
		else if(a[mid]==search)
		{
			System.out.println("element found");
			break;
		}
		else
			low=mid+1;
	
	}
	if(low>high)
	System.out.println("element not found");
	
	}
}