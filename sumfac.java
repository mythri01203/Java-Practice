class main
{
	public static void main(String args[])
	{
		int num=12,sum=0;
		for(int x=1;x<=num;x++)
		{
			if(num%x==0)
			sum=sum+x;
		}
		System.out.println(sum);
	}
}