import java.util.*;
class IsPrime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a no");
int no=sc.nextInt();
int i;
for(i=2;i<=no/2;i++)
{
if(no%i==0)
break;
}
if(i<=no/2)
System.out.println("It is not a prime no");
else
System.out.println("It is a prime no");
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac IsPrime.java
D:\JAVA PROGRAMS>java IsPrime
enter a no
21
It is not a prime no
