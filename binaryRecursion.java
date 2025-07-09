import java.util.Arrays;
class Bin
{
	public static void main(String args[])
	{
		Bin o=new Bin();
		int[] a={12,40,78,9,4};
		Arrays.sort(a);
		String res=o.binary(a,a.length-1,0,4);
		System.out.println(res);
	}
	String binary(int a[],int l,int f,int search)
	{
		if(f>l)
		{
			return "elements not found";
		}
		else
		{
			int m=(f+l)/2;
			if(search == a[m])
			{
				return "elements found";
			}
			else if(search > a[m])
			{
				f=m+1;
			}
			else
			{
				l=m-1;
			}
		return binary(a,l,f,search);
		}
		
	}
}