import java.io.*;
class Odd extends Thread
{
int i;
public void run()
{
try
{
for(i=1;i<=10;i+=2)
{
System.out.print(i);
sleep(1000);
}
}
catch(Exception e)
{}
}
}

class Even extends Thread
{

int i;
public void run()
{
try
{
for(i=2;i<=10;i+=2)
{
System.out.print(i);
sleep(1000);
}
}
catch(Exception e)
{}
}
}

class ThreadDemo2
{
public static void main(String args[])
{
Even e=new Even();
Odd o=new Odd();
o.start();
e.start();
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac ThreadDemo2.java
D:\JAVA PROGRAMS>java ThreadDemo2
21436587109
