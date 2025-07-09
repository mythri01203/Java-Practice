 class Mythri
{
	public static void main(String args[])
	{
		Mythri o=new Mythri();
		o.ch(new char[]{'A','C','b','h','e','i','E'});
	}
	void ch(char a[])
	{
		int count=0,count1=0,count2=0,count3=0,count4=0;
		for(int x=0;x<=a.length-1;x++)
		{
			if(a[x]>='A'&& a[x]<='Z')
			{
				count++;
			}
			else if(a[x]>='a' && a[x]<='z')
			{
				count1++;
			}
			if(a[x]=='A'||a[x]=='E'||a[x]=='I'||a[x]=='O'||a[x]=='U')
			{
				count2++;
			}
		}	
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);	
	}
}
