import java.io.*;
class Main
{
	public static void main(String args[])throws FileNotFoundException
	{
		m1();
	}
	public static void m1()throws FileNotFoundException
	{
		m2();
	}
	public static void m2()throws FileNotFoundException
	{
		m3();
	}
	public static void m3()throws FileNotFoundException
	{
	try
	{
		FileReader file=new FileReader("C:\\Users\\Asus\\OneDrive\\Desktop\\questionier\\mythri1.txt");
		System.out.println("file found");
	}catch(FileNotFoundException e)
	{
		System.out.println("catch");
	}
	}
}