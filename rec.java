class Main
{
	public static void main(String args[])
	{
		Main c=new Main();
		c.palin(101,0,101);
	}
void palin(int num,int rev,int temp)
{
	if(num==0)
	{
		if(temp==rev)
		System.out.println("palindrome");
		else
		System.out.println("not a palindrome");
	}
	else
	{
			rev=rev*10+(num%10);
			num=num/10;
		
		
	palin(num,rev,temp);
	}
}
}