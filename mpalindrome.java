class Main
{
	public static void main(String args[])
	{
		Mythri mythri=new Mythri();
		mythri.palindrome();
	}
}
class Mythri
{
	void palindrome()
	{
		int num=101,rev=0,rem=0,temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}
}