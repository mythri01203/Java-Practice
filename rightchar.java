class Main
{
	public static void main(String args[])
	{
		String s="hello";
		char[] a=s.toCharArray();
			char temp=a[a.length-1];
			int y;
			for(y=a.length-1;y>0;y--)
			{
				a[y]=a[y-1];
				//System.out.println(a[y]);
			}
			a[0]=temp;
			//System.out.println(a[y]);
		for(int x=0;x<a.length;x++)
		System.out.println(a[x]);
	}
}