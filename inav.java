class main
{
	public static void main(String args[])
	{
	int num=199,sum=0,count=0;
	int rem=0;
	while(num>=10)
	{
		sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			
			num=num/10;
		}
		num=sum;
		count++;
	}
	System.out.println(count);
	System.out.println(num);
	if(num==1&&count==1)
		System.out.println("inav number");
	else
		System.out.println("not an ivan number");
	} 
}	