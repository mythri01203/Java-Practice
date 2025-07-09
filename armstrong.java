class Mythri
{
public static void main(String args[])
    {
Student o=new Student();
int num=344;
int res=o.count(num);
int res1=o.sum(num,res);
String res2=o.checkArmstrong(num,res1);
System.out.println(res2);
   }
}
class Student
    {
int count=0;
int count(int num)
   {
while(num!=0)
  {
count++;
num=num/10;
  }
return count;
   }
int sum(int num,int count)
 {	
count(num);
int sum=0;
while(num!=0)
 {
int last=num%10;
int pow=(int)Math.pow(last,count);
sum=sum+pow;
num=num/10;
   }
return sum;
  }
String checkArmstrong(int num,int sum)
{
 if(sum==num)
 {
 return "Armstrong";
 }
else
{
return "not Armstrong";
}
}
}


