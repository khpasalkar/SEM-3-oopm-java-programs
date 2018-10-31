import java.util.*;
class Count
{
public static void main(String args[])
{
String s;
int countu=0,countl=0,countd=0,counts=0,count=0,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
s=sc.nextLine();
n=s.length();
char c[]=new char[n];
c=s.toCharArray();
for(i=0;i<n;i++)
{
if(c[i]>='A'&&c[i]<='Z')
{
countu++;
}
else if(c[i]>='a'&&c[i]<='z')
{
countl++;
}
else if(c[i]>='0'&&c[i]<='9')
{
countd++;
}
else if(c[i]==' ')
{
counts++;
}
else 
{
count++;
}
}
System.out.println("no of upper case "+countu);
System.out.println("no of lower case "+countl);
System.out.println("no of digits "+countd);
System.out.println("no of white spaces "+counts);
System.out.println("no of  special characters "+count);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Count.java
D:\JAVA PROGRAMS>java Count
enter a string
I Have 30 Cups & 10 Glass
no of upper case 4
no of lower case 10
no of digits 4
no of white spaces 6
no of  special characters 1
