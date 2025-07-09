class Main
{
	public static void main(String args[])
	{
		Main m=new Main();
		System.out.println(m.count1(1,11,0));
		//m.count1(1,11,0);

	}
String count1(int start,int end,int count)
{
	if(start<=end)
	{
		if(end%start==0)
		{
			count++;
		}
		
		return count1(++start,end,count);
	}
	else
	{
		if(count==2)
			return "prime";
		else
			return "not prime";
	}

	
}
}