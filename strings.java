class Main
{
	public static void main(String args[])
	{
		String s=new String("hello,GOOD");
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals("hello"));
		System.out.println(s.charAt(3));
		System.out.println(s.concat("my"));
		System.out.println(s.indexOf('o'));
		System.out.println(s.indexOf("hello"));
		System.out.println(s.lastIndexOf('o'));
		String []a=s.split(",");
		for(String temp:a)
		System.out.println(temp+"  split"); 
		System.out.println(s.trim()+"  trim");
		String o = "Java";
char[] chars = o.toCharArray();
for (char c : chars) {
    System.out.println(c);
}







	}
}