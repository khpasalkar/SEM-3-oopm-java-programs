import java.io.*;
class Swap
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println("BEFORE SWAP");
System.out.println("a is "+a);
System.out.println("b is "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("AFTER SWAP");
System.out.println("a is "+a);
System.out.println("b is "+b);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Swap.java
D:\JAVA PROGRAMS>java Swap 3 5
BEFORE SWAP
a is 3
b is 5
AFTER SWAP
a is 5
b is 3
