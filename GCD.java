import java.util.*;
class GCD
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,gcd;
System.out.println("enter two nos:");
a=sc.nextInt();
b=sc.nextInt();
gcd=Gcd(a,b);
System.out.println("GCD="+gcd);
}
static int Gcd(int a,int b)
{
int temp;
if(b>a)
{
temp=a;
a=b;
b=temp;
}
if(a%b==0)
return b;
else 
return(Gcd(b,a%b));
}
}