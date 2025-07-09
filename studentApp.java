class Person
{
	String name1;
	String email;
	String role;
	
	Person(String name1,String email,String role)
	{
		this.name1=name1;
		this.email=email;
		this.role=role;
	}	
}

class Student extends Person
{
	int roll,m1,m2,m3;
	String name;
	double percentage;
	double fee;
	
	Student(String name1,String email,String role,int roll,String name,double percentage,double fee)
	{
		super(name1,email,role);
		this.roll=roll;
		this.percentage=percentage;
		this.name=name;
		this.fee=fee;
	}

	void display()
	{
		System.out.println("person name:"+name1);
		System.out.println("person email:"+email);
		System.out.println("person role:"+role);
		System.out.println("Student roll no: "+roll);
		System.out.println("Student name :"+name);
		System.out.println("Student percentage :"+percentage);
		System.out.println("Student fee :"+fee);
	}
}

class Employee extends Person
{
	int id;
	String dept,name;
	double salary;

	Employee(String name1,String email,String role,int id,String dept,String name,double salary)
	{
		super(name1,email,role);
		this.id=id;
		this.dept=dept;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("................................................................");
		System.out.println("person name:"+name1);
		System.out.println("person email:"+email);
		System.out.println("person role:"+role);
		System.out.println("Employee id:"+id);
		System.out.println("Employee name:"+name);
		System.out.println("Employee department:"+dept);
	}

}

class Main
{
	public static void main(String args[])
	{
		Student s=new Student("mythri","my@gmail.com","dev",12,"mythri",96,70000.0);
		s.display();
		
		Employee e=new Employee("venkat","venkat@gmail.com","test",1,"cse","venkat",90000.0);
		e.display();
	}
}








