class main
{
	public static void main(String args[])
	{
	int num=761,pow=0,rem=0;
	pow=(int)Math.pow(num,2);
	System.out.println(pow);
	rem=pow%100;
	if(num==rem)
	{
		System.out.println("automatic number");
	}
	else
		System.out.println("not an automatic number");
	}
}
		
	