class Main
{
 	public static void main(String args[])
	{
		String s="hello";
		String s1[]=s.split(" ");
		String s3="";
		for(int x=0;x<=s1.length;x++)
		{
			for(int y=x+1;y<=s1.length;y++)
			{
				s3=s1.substring(x,y);
				if(!(s3.contains("a")||s3.contains("e")||s3.contains("i")||s3.contains("o")||s3.contains("u")))
				{
					System.out.println(s3);

				}
			}
		}
	}
}