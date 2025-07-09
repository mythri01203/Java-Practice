class main
{
	public static void main(String args[])
	{
	for(int x=1900;x<=2025;x++)
	{
		int year=x;
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			System.out.println(x+" "+" leap year");
		}
	}
	}
}