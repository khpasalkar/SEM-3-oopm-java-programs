import java.io.*;
class Roots
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
double d=b*b-4*a*c;
double r1=0,r2=0;
if(d<0)
{
System.out.println("roots are complex");
}
else if(d==0)
{
System.out.println("roots are equal");
 r1=-b/2/a;
 r2=-b/2/a;
}
else
{
System.out.println("roots are real");
 r1=-b+Math.sqrt(d)/2/a;
 r2=-b-Math.sqrt(d)/2/a;
}
System.out.println("root1="+r1);
System.out.println("root2="+r2);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Roots.java
D:\JAVA PROGRAMS>java Roots 1 2 1
roots are equal
root1=-1.0
root2=-1.0
