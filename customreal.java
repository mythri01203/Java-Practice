import java.util.Scanner;
class Main
{
	public static void main(String args[])throws InsufficientException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter current balance");
		int balance=sc.nextInt();
		System.out.println("enter withdraw amount");
		int withdraw=sc.nextInt();
		if(balance>=withdraw)
		System.out.println("balance="+(balance-withdraw));
		else
			throw new InsufficientException("insufficient balance");

	}
}
class InsufficientException extends Exception
{
	public InsufficientException(String msg)
	{
		super(msg);
	}
}