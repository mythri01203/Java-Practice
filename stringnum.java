class Main
{
	public static void main(String args[])
	{
		String s="he1llo$h5i&go3od";
		String s2="";
		for(int x=0;x<s.length();x++)
		{
			char ch=s.charAt(x);
			if(ch>='0'&&ch<='9')
			{
				s2=s2+ch;
				//System.out.println(ch);
			}
		}
		System.out.println(s2);
		int num=Integer.parseInt(s2);
		int rem=0,sum=0,pow=0,count=0,copy=num;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		num=copy;
		while(num!=0)
		{
			rem=num%10;
			pow=(int)Math.pow(rem,count);
			sum=sum+pow;
			num=num/10;
		}
		System.out.println((copy==sum)?"armstrong":"not an armstrong");
	}
}	