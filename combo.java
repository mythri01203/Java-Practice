class main
{
	public static void main(String args[])
	{
	int num=4,f=0,s=1,t=0,count=0,count1=0;
	if(num%2==0)
	{
		for(int x=1;x<=num;x++)
		{
			count++;
			if(count==num)
			{
				System.out.println(f);
				break;
			}
			t=f+s;
			f=s;
			s=t;
			//count++;
		}
	}
	else
	{
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			count1++;
		}
		if(count1==0)
		System.out.println("prime");
		else
		System.out.println("not prime");
	}
	}
}
