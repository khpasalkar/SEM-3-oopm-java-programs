import java.util.*;
class Table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no:");
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println(n+" * "+i+" = "+(n*i));
}
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Table.java
D:\JAVA PROGRAMS>java Table
Enter a no:
6
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54
6 * 10 = 60
