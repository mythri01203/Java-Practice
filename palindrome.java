class main
{
	public static void main(String args[])
	{
	int num=101,temp=num,rem=0,rev=0;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(rev==temp)
	System.out.println("palindrome");
	else
	System.out.println("not palindrome");
	}
}