class main
{
	public static void main(String args[])
	{
	int num=111,count=0,temp=num,sum=0,rem=0,pow=0,c=0;
	while(num!=0)
	{
		rem=num%10;
		count++;
		num=num/10;
	}
	 c=count/2;
	pow=(int)Math.pow(10,c);
	int num1=temp%pow;
	int num2=temp/pow;	
	System.out.println(num1+num2);
	}
}	