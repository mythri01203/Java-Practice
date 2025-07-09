class main
{
	public static void main(String args[])
	{
	int num=12345,count=0,rem=0,sum1=0,sum2=0,temp=num;
	while(num!=0)
	{
		rem=num%10;
		count++;
		if(count%2==0)
		{
			sum1=sum1+rem;
		}
		else
		{
			sum2=sum2+rem;
		}
		num=num/10;
	}
		System.out.println("even="+sum1);
		System.out.println("odd="+sum2);
	}
}