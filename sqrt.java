class main
{
	public static void main(String args[])
	{
	int num=5,rem=0,sum=0,temp=num;
	int c=(int)Math.pow(num,2);
	while(c!=0)
	{
		rem=c%10;
		sum=sum+rem;
		c=c/10;
	}
	System.out.println(sum);
	if(sum==num)
	{
		System.out.println("equal");
	}
	else
	{
		System.out.println("not equal");
	}
	}
}