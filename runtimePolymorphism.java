class Main
{
	public static void main(String args[])
	{
		Parent ch;
		ch=new Child();
		ch.m1();
		ch.m2();
		ch.m3();
		//ch.m4();*/
	}
}
class Parent
{
	void m1()
	{
		System.out.println("parent-m1");
	}
	void m2()
	{
		System.out.println("parent-m2");
	}
	void m3()
	{
		System.out.println("m3");
	}
	/*void m4()
	{
		System.out.println("m4");
	}*/

}
class Child extends Parent
{
	String name;
	void m1()
	{
		System.out.println("child-m1");
	}
	void m2()
	{
		System.out.println("child-m2");
	}
	void m3()
	{
		System.out.println("m3");
	}

}