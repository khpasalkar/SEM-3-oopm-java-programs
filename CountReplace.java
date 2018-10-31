import java.util.*;
class CountReplace
{
public static void main(String args[])
{
String s;
int i,n,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
s=sc.nextLine();
n=s.length();
char c[]=new char[n];
c=s.toCharArray();
System.out.println("enter the key");
char key=sc.next().charAt(0);
for(i=0;i<n;i++)
{
if(c[i]==key)
count++;
}
System.out.println("couunt of key is "+count);
s=s.replace(key,'#');
System.out.println("new string is "+s);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac CountReplace.java
D:\JAVA PROGRAMS>java CountReplace
enter a string
krutika pasalkar
enter the key
a
couunt of key is 4
new string is krutik# p#s#lk#r
