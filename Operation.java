import java.io.*;
class Operation
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
System.out.println("SUM is "+(a+b));
System.out.println("SUB is "+(a-b));
System.out.println("MUL is "+(a*b));
System.out.println("DIV is "+(a/b));
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Operation.java
D:\JAVA PROGRAMS>java Operation 6 3
SUM is 9
SUB is 3
MUL is 18
DIV is 2