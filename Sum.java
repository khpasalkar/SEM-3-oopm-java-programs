import java.util.*;
class Sum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0;
System.out.println("enter a no:");
n=sc.nextInt();
while(n!=999)
{
sum=sum+n;
System.out.println("enter a no.");
n=sc.nextInt();
}
System.out.println("sum="+sum);
}
}

OUTPUT:
D:\KRUTIKA>javac Sum.java
D:\KRUTIKA>java Sum
enter a no:
5
enter a no.
10
enter a no.
15
enter a no.
20
enter a no.
30
enter a no.
30
enter a no.
99
enter a no.
999
sum=209
