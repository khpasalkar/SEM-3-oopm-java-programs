import java.util.*;
class Factorial1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
int no=sc.nextInt();
int fact=1;
while(no!=0)
{
fact=fact*no;
no--;
}
System.out.println("Factorial of a no is"+fact);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Factorial1.java
D:\JAVA PROGRAMS>java Factorial1
enter a no
5
Factorial of a no is120
