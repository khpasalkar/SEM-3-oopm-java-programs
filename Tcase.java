import java.util.*;
class Tcase
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s,s1,s2;
int n,i;
System.out.println("enter a string");
s=sc.nextLine();
s=s.toLowerCase();
s1=s.substring(1);
s=s.substring(0,1);
s=s.toUpperCase();
s=s.concat(s1);
n=s.length();
for(i=0;i<n;i++)
{
if(s.charAt(i)==' ')
{
s1=s.substring(0,i+1);
s2=s.substring(i+2);
s=s.substring(i+1,i+2);
s=s.toUpperCase();
s=s1.concat(s);
s=s.concat(s2);
}
}
System.out.println("title case string is "+s);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Tcase.java
D:\JAVA PROGRAMS>java Tcase
enter a string
i love iNdia
title case string is I Love India
