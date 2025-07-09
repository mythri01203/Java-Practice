class Count
{
public static void main(String args[])
{
int start=1,end=100,num=0,count=0;
while(start<=end)
{
num=start;
if(num%2==0)
count++;
start++;
}
System.out.println(count);

}
}
