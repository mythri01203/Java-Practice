class Upper
{
	public static void main(String args[])
	{
	char ch='1';
	if(ch>='a'&&ch<='z')
	{
	ch=(char)(ch-32);
	System.out.println("letter:"+ch);
	}
	else if(ch>='A'&&ch<='Z'){
	ch=(char)(ch+32);
	System.out.println("letter:"+ch);
	}
	else if(ch>='0' && ch<='9')
	{
	System.out.println("digit");
	}
	else
	System.out.println("special symbol");
}
}
	
	
	