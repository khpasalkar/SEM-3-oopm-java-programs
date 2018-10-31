import java.util.*;
class Pattern1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the no of rows:");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j>0;j--)
{
if(j%2==1)
System.out.print("1");
else 
System.out.print("0");
}
System.out.println();
}
}
}

OUTPUT:
D:\KRUTIKA>javac Pattern1.java
D:\KRUTIKA>java Pattern1
enter the no of rows:
4
1
01
101
0101