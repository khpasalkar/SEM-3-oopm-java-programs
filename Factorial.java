import java.util.*;
class Factorial
{
public static void main(String args[])
{
int n,fact;
Scanner sc=new Scanner(System.in);
System.out.println("enter a no.");
n=sc.nextInt();
fact=facto(n);
System.out.println("factorial="+fact);
}
static int facto(int n)
{
if (n==1)
return 1;
else 
return n*facto(n-1);
}
}

OUTPUT:
D:\KRUTIKA>javac Factorial.java

D:\KRUTIKA>java Factorial
enter a no.
5
factorial=120