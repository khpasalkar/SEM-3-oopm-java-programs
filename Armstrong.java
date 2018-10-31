import java.io.*;
class Armstrong
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int sum=0,temp,rem;
temp=n;
while(n>0)
{
rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
if(sum==temp)
System.out.println("it is an armstrong no.");
else
System.out.println("not an armstrong no.");
}
}

OUTPUT:
D:\KRUTIKA>javac Armstrong.java
D:\KRUTIKA>java Armstrong 371
it is an armstrong no.
D:\KRUTIKA>java Armstrong 123
not an armstrong no.
