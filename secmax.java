class main
{
	public static void main(String args[])
	{
	int num=1234,max=0,smax=0,rem=0;
	while(num!=0)
	{
		rem=num%10;
		if(rem>max)
		{
			smax=max;
			max=rem;
		}
		else if(rem>smax&&max>rem)
		
			smax=rem;
			num=num/10;
		
	}
	System.out.println(smax);
	}
}