class main
{
	public static void main(String args[])
	{
	int num=1234,count=0,rem=0;
	while(num!=0)
	{
		rem=num%10;
		count++;
		num=num/10;
	}
	System.out.println(count);
	}
}