class main	
{
	public static void main(String args[])
	{ 
	int num1=17,num2=19,count1=0,count2=0;
	if(num1-num2==2||num1-num2==-2)
	{
		for(int x=2;x<=num1/2;x++)
		{
			if(num1%x==0)
			count1++;
					}
		for(int x=2;x<=num2/2;x++)
		{
			if(num2%x==0) 
			count2++;
		}

	if(count1==0&&count2==0)
		System.out.println("twin prime");
	else
		System.out.println("not twin prime");
	}
	else
		System.out.println("difference is not 2");
	}
}
