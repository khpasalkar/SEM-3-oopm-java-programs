import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,ans;
System.out.println("enter no of terms");
n=sc.nextInt();
System.out.println("fibonacci series is \n0");
for(int i=1;i<=n-1;i++)
{
System.out.println(fibo(0,1,i));
}
}
static int fibo(int a,int b,int i)
{
if(i==1)
return b;
else
return(fibo(b,(a+b),i-1));
}
}

OUTPUT:
D:\KRUTIKA>javac Fibonacci.java
D:\KRUTIKA>java Fibonacci
enter no of terms
10
fibonacci series is
0
1
1
2
3
5
8
13
21
34