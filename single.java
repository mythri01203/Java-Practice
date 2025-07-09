class Main
{
	public static void main(String args[])
	{
		Student p=new Student();
		p.printPerson("Mythri","my@gmail.com","dev");
		p.printStudent(10,'a',7000.0);
		Employee e=new Employee();
		e.printEmployee(1,"cse",500000.0,"female");
	}
}
class Person 
{
	String name;
	String email;
	String role;
	Person()
	{
	}
	void printPerson(String name,String email,String role)
	{
		this.name=name;
		this.email=email;
		this.role=role;
		System.out.println(name+" "+email+" "+role);
	}
}
class Student extends Person
{
	int roll;
	char section;
	double fee;
	Student()
	{
	}
	void printStudent(int roll,char section,double fee)
	{
		this.roll=roll;
		this.section=section;
		this.fee=fee;
		System.out.println(roll+" "+section+" "+fee);
	}
}
class Employee extends Person
{
	int id;
	String dept;
	double salary;
	String gender;
	Employee()
	{
	}
	void printEmployee(int id,String dept,double salary,String gender)
	{
		this.id=id;
		this.dept=dept;
		this.salary=salary;
		this.gender=gender;
		System.out.println(id+" "+dept+" "+salary+" "+gender);
	}
}
