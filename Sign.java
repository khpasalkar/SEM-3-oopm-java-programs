import java.util.*;
class Sign
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
int n=sc.nextInt();
int sign=1;
double sum=0;
for(int i=1;i<=n;i++)
{
sum=sum+1.0/(i*sign);
sign*=-1;
}
System.out.println("sum is "+sum);
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Sign.java
D:\JAVA PROGRAMS>java Sign
Enter the value of n
4
sum is 0.5833333333333333
