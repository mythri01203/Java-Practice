class Mythri
{
	public static void main(String args[])
	{
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	for(int x=0;x<=a.length-1;x++)
	{
		for(int y=0;y<=a[x].length-1;y++)
		{
			if(x+y==a.length-1)
			System.out.print(a[x][y]+" ");
			else
			System.out.print(" ");


		}
		System.out.println();

	}
}
}