class Main
{
	public static void main(String args[])
	{
		String s="hello all & 2 23";
		int count=0,count1=0,count2=0,count3=0,count4=0;
		for(int x=0;x<s.length();x++)
		{
			char c=s.charAt(x);
			if(c>='a'&&c<='z')
			{
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
					count++;
				else
					count1++;
			}
			else if(c>='0'&&c<='9')
				count2++;
			else if(c==' ')
				count3++;
			else
				count4++;
		}
		System.out.println("count of vowels:"+count);
		System.out.println("count of consonants:"+count1);
		System.out.println("count of digits:"+count2);
		System.out.println("count of space:"+count3);
		System.out.println("count of symbols:"+count4);


	}
}