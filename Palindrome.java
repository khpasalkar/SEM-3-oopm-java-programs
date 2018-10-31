import java.util.*;
class Palindrome
{
public static void main(String args[])
{
String s;
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
s=sc.nextLine();
n=s.length();
char c[]=new char[n];
char rev[]=new char[n];
c=s.toCharArray();
for(i=0;i<n;i++)
{
rev[n-i-1]=c[i];
}
for(i=0;i<n;i++)
{
if(rev[i]!=c[i])
break;
}
if(n==i)
{
System.out.println("it is a palindrome");
}
else
{
System.out.println("it is not a palindrome");
}
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Palindrome.java
D:\JAVA PROGRAMS>java Palindrome
enter a string
nitin
it is a palindrome
D:\JAVA PROGRAMS>java Palindrome
enter a string
krutika
it is not a palindrome
