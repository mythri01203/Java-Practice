class Alternative
{
public static void main(String args[])
{
int num=898965,rev=0,rem=0,count=0;
while(num!=0)
{
rem=num%100;
char ch=(char)rem;
System.out.println(ch);
rev=rev*100+rem;
while(rev!=0)
 {
int rem1=rev%10;
char ch1=(char)rem1;
rev=rev/10;
System.out.println(ch1);
 }
rev=rev/100;
num=num/100;

}
}
}