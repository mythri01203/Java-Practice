class main
{
	public static void main(String args[])
	{
	int num=5346,count=0,rem=0,temp=num,sum1=0,sum2=0;
	while(num!=0)
	{
		count++;
		num=num/10;
	}
	int c=count/2;
	int pow=(int)Math.pow(10,c);
	int num1=temp%pow;
	int num2=temp/pow;
	while(num1!=0)
	{
		rem=num1%10;
		sum1=sum1+rem;
		num1=num1/10;
	}
	while(num2!=0)
	{
		rem=num2%10;
		sum2=sum2+rem;
		num2=num2/10;
	}
	System.out.println(sum1+sum2);
	}
}
		