class Main
{
	public static void main(String args[])
	{
		String s="hello";
		char[] a=s.toCharArray();
			char temp=a[0];
			int y;
			for(y=0;y<a.length-1;y++)
			{
				a[y]=a[y+1];
				System.out.println(a[y]);
			}
			a[a.length-1]=temp;
			System.out.println(a[y]);
		
	}
}