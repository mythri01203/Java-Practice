class Main
{
	public static void main(String args[])
	{
		Student s=new Student();
	}
}
class Student
{
	Student()
	{
		this(12);
		System.out.println("default constructor");
	}
	Student(int x)
	{
		this(12.56);
		System.out.println("int constructor");
	}
	Student(double y)
	{
		//this();
		System.out.println("double constructor");
	}
}

	