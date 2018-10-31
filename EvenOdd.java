import java.util.*;
class EvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
int no=sc.nextInt();
if(no%2==0)
{
System.out.println("number is even");
}
else
{
System.out.println("number is odd");
} 
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac EvenOdd.java
D:\JAVA PROGRAMS>java EvenOdd
enter a no
5
number is odd
