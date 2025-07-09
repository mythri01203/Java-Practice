class Main
{
	public static void main(String args[])
	{
		Sample sample=new Sample(12,'a',"apple");
		
		System.out.println(Sample.name+Sample.roll);
	}
}
class Sample
{
	int roll;
	char section;
	String name;
	static String institute;
	{
		Sample(int roll,char section,String name,String institute)
		{
			this.roll=roll;
			this.section=section;
			this.name=name;
		}
	}
}
