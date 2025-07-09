class Mythri
{
public static void main(String args[])
{
int a[]=new int[]{1,2,3,4,5,6,7,8};
for(int x=0;x<=a.length-1;x++)
{
if(a[x]%2==0)
{
System.out.println(a[x]);
}
}
for (int y=0;y<=a.length-1;y++)
{
if(y%2!=0)
{
System.out.println(a[y]);
}
}
}
}
