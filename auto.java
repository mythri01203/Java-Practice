class EvilNumber
{
public static void main(String args[])
{
Student s=new Student();
int res1=s.automatic();
System.out.println(res1);
String res2=s.a();
System.out.println(res2);
}
}
class Student
{
int num=76,pow=2,start=0,temp=0,last=0;
int automatic()
{
while(num!=0)
{
int rem=num%10;
int res=(int)Math.pow(num,pow);
num=num/10;
return res;
}
}
temp=automatic();
String a(int automatic)
{
while(temp!=0)
  {
count++;
num=num/10;
  }
}
return count;
int last=temp%100;
System.out.println(last);
if(last==num)
{
return "automic number";
}
else
{
return"not automatic number";
}
}
} 
}


