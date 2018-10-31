import java.util.*;
class LeapYear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a year");
int yr=sc.nextInt();
if(yr%4==0||yr%400==0&&yr%100!=0)
{
System.out.println("It is a leap year");
}
else
{
System.out.println("It is not a leap year");
}
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac LeapYear.java
D:\JAVA PROGRAMS>java LeapYear
enter a year
2016
It is a leap year
