import java.io.*;
class SwapStrings
{
public static void main(String args[])
{
String s1=args[0];
String s2=args[1];
System.out.println("BEFORE SWAP");
System.out.println("STRING1 is "+s1);
System.out.println("STRING2 is "+s2);
String temp;
temp=s1;
s1=s2;
s2=temp;
System.out.println("AFTER SWAP");
System.out.println("STRING1 is "+s1);
System.out.println("STRING2 is "+s2);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac SwapStrings.java
D:\JAVA PROGRAMS>java SwapStrings krutika pasalkar
BEFORE SWAP
STRING1 is krutika
STRING2 is pasalkar
AFTER SWAP
STRING1 is pasalkar
STRING2 is krutika
