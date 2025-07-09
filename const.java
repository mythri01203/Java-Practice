class Main
{
	public static void main(String args[])
	{
		Student student=new Student();
		student.m1(10.0);
	}
}
class Student
{
	//int a;
	Student()
	{
		System.out.println("int");
	}
	
	void m1(double a)
	{
		System.out.println("double");
	}
	void m1(String a)
	{
		System.out.println("string");
	}
	
}