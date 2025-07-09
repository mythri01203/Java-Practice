
	class Sample
	{
		static int a=10,b,max;
		static
		{
			a=4;
			b=a*2;
		}
		static 
		{

			max=40;
		}
		static void display()
		{
			System.out.println("a="+a);
			System.out.println("b="+b);
			System.out.println("max="+max);
		}
		public static void main(String args[])
		{
			a=20;
			display();
		}
	}
