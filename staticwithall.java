class Main
{
	static int roll=14;
	public static void main(String args[])
	{
		Sample.m1();
	}
}
class Sample
{
	static String name="Mythri";
	static int roll;
	static char section='a';
	static void m1()
	{
		System.out.println(name+" "+roll+" "+section+" ");
	}
	/*static
	{
		roll=13;
	}*/
}