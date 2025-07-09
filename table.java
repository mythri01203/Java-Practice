class main
{
	public static void main(String args[])
	{
	int y;
	for(y=1;y<=4;y++)
	{
		int num=y,mul=1;
		for(int x=1;x<=10;x++)
		{
			mul=num*x;
			System.out.println(y+"*"+x+"="+mul);
		}
	}
	}
}