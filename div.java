class Div
{
public static void main(String args[])
{
int start=100,end=1,num=1;
while(start>=end)
{
num=start;
if(num%5==0&&num%3==0)
System.out.println(num+" fizzbuzz");
start--;
}
}
}
