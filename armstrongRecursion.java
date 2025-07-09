class Mythri
{
	public static void main(String args[])
	{
		Mythri b=new Mythri();
		b.range(1,1000);
	
	}
	int count(int num,int count)
	{
		if(num==0)
		{
			return count;
		}
		else
		{
			count++;
			num=num/10;
       
		}
		return count(num,count);
	}
	int summ(int num,int count,int sum)
	{
		if(num==0)
		{
			return sum;
		}
		else
		{
			int rem=num%10;
			int por=(int)Math.pow(rem,count);
                        sum=sum+por;
			num=num/10;
		}
		return summ(num,count,sum);
	}
	String Armstrong(int num,int sum)
	{
		if(sum==num)
		{
			return "Armstrong";
		}
		else
			return "";
	}
	void range(int start,int end)
	{
		if(start==end)
		{
		}
		else
		{
			int count=count(start,0);
			int sum=summ(start,count,0);
			String res=Armstrong(start,sum);
			if(res!="")
			{
				System.out.println(start+" "+res);
				
			}
			range(start+1,end);
		}
	}
}
		
	