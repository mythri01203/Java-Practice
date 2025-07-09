class Mythri
{
	public static void main(String args[])
	{
	Mythri b=new Mythri();
	String res=b.count(new int[]{10,20,30,40,50},new int[]{10,20,30,40,50});
	System.out.println(res);
	}
		String count(int a[],int b[])
		{
		
		if(a.length==b.length)
		{
		for(int j=0;j<=a.length-1;j++)
		{
			if(a[j]==b[j])
			{
			return "equal";
			}
		else
			return "not equal";
		
		}			
		}
		}
}
