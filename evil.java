class main
{
	public static void main(String args[])
	{
	int num=9,pow=0,rem=0,sum=0;
	pow=(int)Math.pow(num,2);
	System.out.println(pow);
	while(pow!=0)
	{
		rem=pow%10;
		sum=sum+rem;
		pow=pow/10;
	}
	System.out.println(sum);
	if(num==sum)
	{
		System.out.println("evil number");
	}
	else
		System.out.println("not an evil number");
	}
}
	