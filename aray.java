import java.util.Scanner;
class Main
{
	public  static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array index: ");
		int index=sc.nextInt();
		int a[]={10,20,30,40,50,60,70};
		for(int x=index;x>=0;x--)
		{
			System.out.print(a[x]+" ");
		}
		for(int x=index+1;x<=a.length-1;x++)
		{
			System.out.print(a[x]+" ");
		}
	}
}