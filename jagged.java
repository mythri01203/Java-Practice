import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row size: ");
		int row=sc.nextInt();
		int a[][]=new int[row][];
		for(int x=0;x<=a.length-1;x++)
		{
			System.out.println("enter"+x+"row column value:");
			int col=sc.nextInt();
			a[x]=new int[col];
			System.out.println("enter"+x+"column values");
			for(int y=0;y<=a[x].length-1;y++)
			{
				a[x][y]=sc.nextInt();
			}
		}
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=0;y<=a[x].length-1;y++)
			{
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
	}
}
		
		
