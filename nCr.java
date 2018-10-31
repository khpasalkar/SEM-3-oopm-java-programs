import java.util.*;
class nCr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,r;
double npr,ncr;
System.out.println("enter the value for n and r");
n=sc.nextInt();
r=sc.nextInt();
ncr=fact(n)/(fact(r)*fact(n-r));
npr=fact(n)/fact(r);
System.out.println("nCr="+ncr);
System.out.println("nPr="+npr);
}
static int fact(int n)
{
if(n==1)
return 1;
else 
return(n*fact(n-1));
}
}

OUTPUT:
D:\KRUTIKA>javac nCr.java
D:\KRUTIKA>java nCr
enter the value for n and r
5
3
nCr=10.0
nPr=20.0
