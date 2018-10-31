import java.util.*;
class Account
{
Scanner sc=new Scanner(System.in);
double balance,minimum;
String acctno,accttype;
Account(String s,String s1,double bal,double min)
{
acctno=s;
 accttype=s1;
 balance=bal;
minimum=min;
}
void withdrawal()
{
System.out.println("enter the amount to withdraw");
double w=sc.nextDouble();
if(w>balance)
{
System.out.println("withdrawal not possible");
}
else if(w<balance&&balance<minimum)
{
System.out.println("balance below minimum");
if(w+(0.1*minimum)>balance)
System.out.println("withdrawal+fine is insufficient");
else
{
System.out.println("you will be charged with "+(0.1*minimum)+" fine\n enter yes to continue");
String k=sc.next();
k=k.toLowerCase();
char c=k.charAt(0);
if(c=='y')
{
balance=balance-w-(minimum*0.1);
System.out.println("transaction successful");
}
}
}
else
{
balance=balance-w;
System.out.println("transaction successful");
System.out.println("Balance is "+balance);
}
}
void deposit()
{
System.out.println("enter the amount to deposit");
double dep=sc.nextDouble();
balance=balance+dep;
System.out.println("Balance is "+balance);
}

void display()
{
System.out.println("Balance is "+balance);
}
}

class Bank
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int choice=1,n;
double bal,min;
String s,s1;
System.out.println("enter account no. and type of account ");
 s=sc.next();
 s1=sc.next();
System.out.println("enter balance and minimum balance required");
bal=sc.nextDouble();
min=sc.nextDouble();
Account A=new Account(s,s1,bal,min);
while(choice==1)
{
System.out.println("enter your choice:\n1:deposit\n2:withdrawal\n3:display");
n=sc.nextInt();
switch(n)
{
case 1:A.deposit();
break;
case 2:A.withdrawal();
break;
case 3:A.display();
break;
default:System.out.println("invalid choice");
}
System.out.println("enter 1 to continue");
choice=sc.nextInt();
}
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac Bank.java
D:\JAVA PROGRAMS>java Bank
enter account no. and type of account
AC38
joint
enter balance and minimum balance required
5000
500
enter your choice:
1:deposit
2:withdrawal
3:display
1
enter the amount to deposit
5000
Balance is 10000.0
enter 1 to continue
1
enter your choice:
1:deposit
2:withdrawal
3:display
2
enter the amount to withdraw
9000
transaction successful
Balance is 1000.0
enter 1 to continue
1
enter your choice:
1:deposit
2:withdrawal
3:display
2
enter the amount to withdraw
600
transaction successful
Balance is 400.0
enter 1 to continue
1
enter your choice:
1:deposit
2:withdrawal
3:display
100
invalid choice
enter 1 to continue
1
enter your choice:
1:deposit
2:withdrawal
3:display
2
enter the amount to withdraw
100
balance below minimum
you will be charged with 50.0 fine
 enter yes to continue
yes
transaction successful
enter 1 to continue
1
enter your choice:
1:deposit
2:withdrawal
3:display
3
Balance is 250.0
enter 1 to continue


