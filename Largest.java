import java.io.*;
class Largest
{
public static void main(String args[])
{
int large;
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
if(a>b)
large=a;
else 
large=b;
if(c>large)
large=c;
System.out.println("largest="+large);
}
}

OUTPUT:
D:\KRUTIKA>javac Largest.java
D:\KRUTIKA>java Largest 5 3 8
largest=8