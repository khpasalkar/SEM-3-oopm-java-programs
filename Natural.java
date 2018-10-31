import java.util.*;
class Natural
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no");
int n=sc.nextInt();
int sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("Sum of  "+n+" natural no. is "+sum);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Natural.java
D:\JAVA PROGRAMS>java Natural
Enter a no
5
Sum of  5 natural no. is 15