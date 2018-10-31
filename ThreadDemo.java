import java.io.*;
class  Slash extends Thread
{
int i;
public void run()
{
try
{
for(i=0;i<4;i++)
{
System.out.print("/");
sleep(1000);
}
}
catch(Exception e)
{}
}
}

class Eight extends Thread
{
int i;
public void run()
{
try
{
for(i=0;i<4;i++)
{
System.out.print("8");
sleep(1000);
}
}
catch(Exception e)
{}
}
}

class ThreadDemo
{
public static void main(String args[])
{
Slash s=new Slash();
Eight e=new Eight();
s.start();
e.start();
}
}

OUTPUT:
C:\Users\pranali>d:
D:\>cd JAVA PROGRAMS
D:\JAVA PROGRAMS>javac ThreadDemo.java
D:\JAVA PROGRAMS>java ThreadDemo
/8/8/8/8