class Main
{
	public static void main(String args[])
	{
		Parent c=new Child();
		c.m1();
		c.m2();
	}
}
class Parent
{
	
	static void m1()
	{
		System.out.println("parent 1");
	}
	static void m2()
	{
		System.out.println("parent 2");
	}
}
class Child extends Parent
{
	@Override
	void m1()
	{
		System.out.println("child");
	}
}