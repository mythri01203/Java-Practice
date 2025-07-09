class Main
{
	public static void main(String args[])
	{
	Student student=new Student("mythri","add");
	System.out.println(student.empMain());
	}
}
class Student
{
String name;
String address;
Student(String name,String address)
{
	 this.name=name;
	this.address=address;
	double salary=50000;
	double annual_salary=salary*12;
}
String empMain()
{
	return name+" "+address;
}
}