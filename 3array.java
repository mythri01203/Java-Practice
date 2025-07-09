class Main
{
	public static void main(String args[])
	{
		int a[]={139,12,34,5,566,7};
		char ch[]={'c','3','(','?'};
		String s[]={"hello","all","good","morning","455","?<>|+_"};
		Boolean b[]={true,false,true,false,true};
		for(int temp:a)
		{
			System.out.print(temp+" ");	
		}
		System.out.println();
		for(char temp:ch)
		{
			System.out.print(temp+" ");	
		}
		System.out.println();
		for(String temp:s)
		{
			System.out.print(temp+" ");	
		}
		System.out.println();
		for(boolean temp:b)
		{
			System.out.print(temp+" ");	
		}

	}
}
