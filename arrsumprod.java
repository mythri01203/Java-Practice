class Mythri
{
	public static void main(String args[])
	{
	int a[]=new int[]{1,2,3,4,5,6,7,8}, sum=0,prod=1;

	for(int x=0;x<=a.length-1;x++)
	{
		if(a[x]%2==0)
	     {
				sum=sum+a[x];
	     }

                if(a[x]%2!=0)
               {
            
               prod=prod*a[x];
               }
      }
        System.out.println("sum is"+sum+"prod is"+prod);
}
}

