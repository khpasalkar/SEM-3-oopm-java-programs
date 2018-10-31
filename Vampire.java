import java.util.*;
class Vampire
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int no,flag=0,temp,i,copy;
int a[]=new int[4];
System.out.println("enter a no.");
no=sc.nextInt();
copy=no;
for(i=0;i<4;i++)
{
a[i]=no%10;
no=no/10;
}
no=copy;
for(i=0;i<=2;i++)
{
if(((a[0]*10+a[1])*(a[2]*10+a[3]))==no)
flag++;
if(((a[0]*10+a[1])*(a[3]*10+a[2]))==no)
flag++;
if(((a[1]*10+a[0])*(a[2]*10+a[3]))==no)
flag++;
if(((a[1]*10+a[0])*(a[3]*10+a[2]))==no)
flag++;
temp=a[1];
a[1]=a[(i+2)%4];
a[(i+2)%4]=temp;
}
if(flag==0)
System.out.println("it is not a vampire no.");
else
System.out.println("it is a vampire no.");
}
}