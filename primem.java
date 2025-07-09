class Student
{
	int prime()
	{
		int num=11,count=0;
		for(int x=2;x<=num/2;x++)
		{
			if(num%x==0)
			count++;
		}
		return count;
	}
}
class Main
{
	public static void main(String args[])
	{
		Student a=new Student();
		int res=a.prime();
		System.out.println((res==0)?"prime":"not prime");
	}
}