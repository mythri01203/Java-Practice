class Main
{
	public static void main(String args[])
	{
		Sample sam=new Sample("mythri",1);
		sam.m1();
		Sample s2=new Sample("rajitha",2);
		s2.m1();
	}
}
class Sample
{
	static String college="sri sarathi";
	int roll;
	String name;
	Sample(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	 void m1()
	{
		System.out.println(name+" "+roll+" "+college);
	}
}
