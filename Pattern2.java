import java.io.*;
class Pattern2
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}

OUTPUT:
D:\KRUTIKA>javac Pattern2.java
D:\KRUTIKA>java Pattern2 4
1
12
123
1234