//import java.util.Scanner;
class Main
{
	public static void main(String args[])throws XyzException
	{
		throw new XyzException("I'm custom Exception");
	}
}
class XyzException extends Exception
{
	public XyzException(String msg)
	{
		super(msg);
	}
}