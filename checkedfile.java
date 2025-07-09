import java.util.Scanner;
import java.io.*;
class Main
{
	public static void main(String args[])throws FileNotFoundException
	{
		String path="C:\\Users\\Asus\\OneDrive\\Desktop\\java programs\\oddmax.java";
		File file=new File(path);
		Scanner sc=new Scanner(file);
		int count=0;
		String s="";
		while(sc.hasNextLine())
		{
			s=sc.nextLine();
			String s1[]=s.split(" ");
			for(int x=0;x<s1.length;x++)
			{
				System.out.println(s1[x]);
				count++;
			}
		}
		System.out.println(count);
	}
}