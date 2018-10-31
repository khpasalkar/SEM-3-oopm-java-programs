import java.io.*;
class SeperateDigits
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int rev=0,d;
while(n!=0)
{
d=n%10;
n=n/10;
rev=rev*10+d;
}
while(rev!=0)
{
d=rev%10;
System.out.println(d);
rev=rev/10;
}
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac SeperateDigits.java
D:\JAVA PROGRAMS>java SeperateDigits 345
3
4
5





