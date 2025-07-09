class main
{
	public static void main(String args[])
	{
	int num=11,count=0;
	for(int x=2;x<=num/2;x++)
	{
		if(num%x==0)
		count++;
	}
	if(count==0)
	System.out.println("prime");
	else
	System.out.println("not prime");
	}
}