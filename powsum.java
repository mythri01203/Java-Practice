class Powsum
{
public static void main(String args[])
{
int sum=0,product=1,start=1,end=10;
while(start<=end)
{
sum=sum+start;
product=product*start;
start++;
}
System.out.println("sum is"+ sum);
System.out.println("product is"+ product);
if(sum==product)
{
System.out.println("sum and product are equal");
}
else
System.out.println("not equal");
}
}